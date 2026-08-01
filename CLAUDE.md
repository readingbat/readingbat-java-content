# CLAUDE.md

## Project Overview

This is a **ReadingBat content repository** — it defines Java and Kotlin programming challenges served by the [readingbat-core](https://github.com/readingbat/readingbat-core) platform. It is not a standalone application; it provides challenge content that the ReadingBat server renders as interactive coding exercises.

## Conventions

Record notable changes in `CHANGELOG.md` under an `[Unreleased]` heading; it becomes the
next version's section at release time. Releases are tagged without a `v` prefix (`1.0.1`),
and the version lives in `gradle.properties`.

## Build & Test Commands

`make help` lists every build, test, lint, and run target.

```bash
./gradlew test -Dkotest.filter.tests="<name>"  # Filter Kotest cases by name
```

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
