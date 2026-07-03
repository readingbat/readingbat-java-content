# ReadingBat Java Content

Java and Kotlin programming challenges for the [ReadingBat](https://github.com/readingbat/readingbat-core)
platform. This repository defines the challenge content that the ReadingBat server
renders as interactive coding exercises — it is not a standalone application.

More than 200 challenges are organized into 25 groups (14 Java, 11 Kotlin), ordered
by difficulty from warmups through recursion, lambdas, and collection transformations.

## Getting Started

Requires a JDK compatible with the Gradle JVM toolchain. The toolchain version is
centralized in `gradle/libs.versions.toml` (the `jvm` key); Gradle will provision it
automatically.

```bash
./gradlew build -x test         # Compile without running tests
./gradlew run                   # Start the content server on http://localhost:8080
./gradlew --rerun-tasks check   # Run all tests
./gradlew test --tests "ContentTests"           # Run a single test class
./gradlew test -Dkotest.filter.tests="<name>"   # Filter Kotest cases by name
```

A `Makefile` wraps the common tasks — run `make` (or `make help`) to see them all:

```bash
make build          # Compile without tests
make tests          # Run all tests
make lint           # Run kotlinter + detekt
make format         # Format Kotlin sources with kotlinter
make cc             # Continuous compilation (watches for changes)
make run            # Start the content server locally (port 8080)
make uberjar        # Build fat jar at build/libs/server.jar
make uber           # Build the uberjar and run it
make versions       # Check for dependency updates
```

When running locally, challenge files are loaded directly from disk (via
`FileSystemSource`), so edits are picked up on reload without a rebuild. Production
builds load content from this GitHub repository instead.

## Challenge Structure

Each challenge is a standalone source file with a `main()` that prints expected
outputs. Those output lines become the answer key for the exercise.

**Java** (`src/main/java/<package>/`):
```java
// @desc Determine if one value is less than another with the **<** operator.
public class LessThan {
    public static boolean compare(int val1, int val2) {
        return val1 < val2;
    }
    public static void main(String[] args) {
        System.out.println(compare(4, 6));   // true
        System.out.println(compare(12, 8));  // false
    }
}
```

**Kotlin** (`src/main/kotlin/<package>/`):
```kotlin
fun doubleIt(i: Int): Int = i * 2

fun main() {
    println(doubleIt(5))   // 10
    println(doubleIt(10))  // 20
}
```

The `@desc` comment (markdown-aware) provides the challenge description shown to
students. Kotlin challenges require an explicit `returnType` (e.g. `IntType`,
`StringType`, `IntListType`) when registered.

All challenges are registered in `src/main/kotlin/Content.kt` using the
`readingBatContent` DSL, either individually via `challenge("ClassName")` or in bulk
via `includeFiles` / `includeFilesWithType` glob patterns.

## Content Catalog

**Java groups** — Warmup 1 & 2, Boolean Expressions, Math Operations, If Statements,
Switch Statements, For Loops, While Loops, String Operations, Character Operations,
Arrays, Nested Loops, Recursion, and 2D Arrays.

**Kotlin groups** — String Templates, When Expressions, Ranges, Null Safety, Lambda
Intro, Misc Lambdas, Strings, Collection Transformations, Fold and Reduce, Zip and
Partition, and Scope Functions.

## Project Layout

```
src/main/kotlin/Content.kt        # Central DSL declaring all challenges by language/group
src/main/kotlin/ContentServer.kt  # Server entry point (delegates to readingbat-core)
src/main/java/<package>/*.java     # Java challenge files
src/main/kotlin/<package>/*.kt     # Kotlin challenge files
src/main/resources/application.conf # HOCON server config (content, site, Ktor settings)
src/test/kotlin/ContentTests.kt    # Kotest suite validating every challenge
gradle/libs.versions.toml          # Centralized dependency & toolchain versions
```

## Tech Stack

- Kotlin / JVM, Gradle (Kotlin DSL) with a version catalog
- [readingbat-core](https://github.com/readingbat/readingbat-core) — the platform library (from JitPack)
- Ktor test host + Kotest — challenge validation
- detekt + kotlinter — static analysis and formatting

## Testing

`ContentTests.kt` uses Kotest `StringSpec` with Ktor's `testApplication` to validate
every challenge: empty answers must report `NOT_ANSWERED`, wrong answers `INCORRECT`,
and the expected outputs `CORRECT`. A CI workflow runs the tests and lint on every
push and pull request.

## Documentation

- [CHANGELOG.md](CHANGELOG.md) — dated history of notable changes
- [RELEASE_NOTES.md](RELEASE_NOTES.md) — narrative summary of major milestones
- [CLAUDE.md](CLAUDE.md) — guidance for AI-assisted development
- `llms.txt` — machine-readable project summary

## License

Apache License 2.0. See [LICENSE](LICENSE).
