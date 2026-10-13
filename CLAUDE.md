# CLAUDE.md

## Project Overview

This is a **ReadingBat content repository** — it defines Java and Kotlin programming challenges served by the [readingbat-core](https://github.com/readingbat/readingbat-core) platform. It is not a standalone application; it provides challenge content that the ReadingBat server renders as interactive coding exercises.

## Conventions

Record notable changes in `CHANGELOG.md` under an `[Unreleased]` heading; it becomes the
next version's section at release time. Releases are tagged without a `v` prefix (`1.2.0`),
and the version lives in `gradle.properties`.

`.gitattributes` governs line endings: stored blobs are LF, `gradlew` stays LF, and
`*.bat` is checked out CRLF because `cmd.exe` mis-parses LF batch files.

## Build & Test Commands

`make help` lists every build, test, lint, and run target.

```bash
./gradlew test -Dkotest.filter.tests="<name>"  # Filter Kotest cases by name
```

`gradle.properties` turns the configuration cache on, so build logic has to be
configuration-cache safe. `dependencyUpdates` is marked incompatible, and the `make versions`
targets pass `--no-configuration-cache` for it.

## Dependencies

Every version lives in `gradle/libs.versions.toml`. One is deliberately out of step:
`kotlin-scripting` holds the runtime Kotlin scripting jars (`kotlin-scripting-*`,
`kotlin-compiler-embeddable`, `kotlin-daemon-embeddable`, `kotlin-script-runtime`) at 2.4.10
while `kotlin` moves on, and `configureScripting()` in `build.gradle.kts` applies it to
`runtimeClasspath` and `testRuntimeClasspath` only. From Kotlin 2.4.20 the JSR-223 engine
never disposes a script state's compiler environment (about 27 MB each), and readingbat-core
starts a state for every Kotlin challenge, so without the pin `ContentTests` runs out of heap
in the Kotlin sweep. Leave it in place when upgrading Kotlin. Remove it only after a Kotlin
release fixes the engine or readingbat-core pins the jars itself, and confirm with
`make clean tests`.

## Testing

`src/test/kotlin/ContentTests.kt` sweeps every challenge through a Ktor test host, one
language at a time. Two constraints there are easy to break:

- Await `runTestApplication` directly in the sweeps rather than calling `testApplication`.
  `testApplication` is `runTestWithRealTime { runTestApplication(..) }`, and that wrapper
  imposes `runTest`'s 60s default — a ceiling a Kotest `TestConfig(timeout = ..)` cannot
  raise, which surfaces as `UncompletedCoroutinesError` on a slow runner instead of an
  assertion failure. A Kotest test body is already a coroutine, so awaiting the inner
  entry point leaves the declared timeout as the only governing limit.
- The sweeps name `content.java` and `content.kotlin` explicitly, so a language added to
  `Content.kt` needs a sweep of its own. The `Per-language tests cover every challenge`
  case fails the suite as a reminder.

## Architecture

### Content Definition (DSL)

`src/main/kotlin/Content.kt` is the central file. It uses the `readingBatContent` DSL to declare all challenges organized by language, groups, and individual challenges. The DSL references:
- A `repo` source — `GitHubRepo` in production, `FileSystemSource("./")` for local dev (controlled by `isProduction()`). Local dev reads challenge files directly from disk, so edits are picked up on reload without a rebuild.
- Challenges can be added individually via `challenge("ClassName")` or in bulk via `includeFiles` / `includeFilesWithType` glob patterns

### Challenge File Convention

Each challenge is a standalone source file with a `main()` method that prints expected outputs. The `main()` output lines become the expected answers for the challenge. The class/file name must match what's declared in `Content.kt`.

- **Java challenges** (`src/main/java/<package>/`): A public class with a static method and a `main()` that calls it with test inputs via `System.out.println()`. The `@desc` comment (supports markdown) provides the challenge description.
- **Kotlin challenges** (`src/main/kotlin/<package>/`): Top-level functions with a `main()` that calls them via `println()`. Kotlin challenges require an explicit `returnType` (e.g., `IntType`, `StringType`, `IntListType`) when declared in `Content.kt`, either per-challenge or via `includeFilesWithType`.

All server logic lives in the `readingbat-core` dependency; this repo only supplies content.
