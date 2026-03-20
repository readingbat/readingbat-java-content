# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a **ReadingBat content repository** — it defines Java and Kotlin programming challenges served by the [readingbat-core](https://github.com/readingbat/readingbat-core) platform. It is not a standalone application; it provides challenge content that the ReadingBat server renders as interactive coding exercises.

## Build & Test Commands

```bash
./gradlew build -x test       # Compile without tests
./gradlew --rerun-tasks check  # Run all tests
./gradlew run                  # Start the content server locally (port 8080)
make tests                     # Shortcut for running tests
make build                     # Shortcut for compile
make cc                        # Continuous compilation (watches for changes)
make versioncheck              # Check for dependency updates
```

The project uses JVM toolchain 17 and Kotest with JUnit Platform.

## Architecture

### Content Definition (DSL)

`src/main/kotlin/Content.kt` is the central file. It uses the `readingBatContent` DSL to declare all challenges organized by language, groups, and individual challenges. The DSL references:
- A `repo` source — `GitHubRepo` in production, `FileSystemSource("./")` for local dev (controlled by `isProduction()`)
- `java { }` and `kotlin { }` blocks that define language sections
- `group()` blocks with `packageName`, `description`, and challenge declarations
- Challenges can be added individually via `challenge("ClassName")` or in bulk via `includeFiles` / `includeFilesWithType` glob patterns

### Challenge File Convention

Each challenge is a standalone source file with a `main()` method that prints expected outputs. The `main()` output lines become the expected answers for the challenge. The class/file name must match what's declared in `Content.kt`.

- **Java challenges** (`src/main/java/<package>/`): A public class with a static method and a `main()` that calls it with test inputs via `System.out.println()`. The `@desc` comment (supports markdown) provides the challenge description.
- **Kotlin challenges** (`src/main/kotlin/<package>/`): Top-level functions with a `main()` that calls them via `println()`. Kotlin challenges require an explicit `returnType` (e.g., `IntType`, `StringType`, `IntListType`) when declared in `Content.kt`, either per-challenge or via `includeFilesWithType`.

### Configuration

`src/main/resources/application.conf` uses HOCON format to configure the ReadingBat server. The `readingbat.content` block points to the content file and variable name. The `readingbat.site` block controls production mode, DBMS, caching, and OAuth settings. Ktor deployment settings (port, watch paths) are also configured here.

### Server Entry Point

`ContentServer.kt` is a top-level `main` function that starts `ReadingBatServer` — all server logic lives in the `readingbat-core` dependency.

### Tests

`src/test/kotlin/ContentTests.kt` uses Kotest `StringSpec` with Ktor's `testApplication` to validate all challenges: verifying empty answers are NOT_ANSWERED, wrong answers are INCORRECT, and correct answers are CORRECT. Tests use helpers from `readingbat-core`'s `TestSupport`.

## Dependencies

Managed via `gradle/libs.versions.toml`. Key dependencies:
- `readingbat-core` — the ReadingBat platform (from JitPack)
- `common-utils` — shared utilities (provides `FileSystemSource`, `GitHubRepo`)
- `kotest` + `ktor-server-test` — testing
