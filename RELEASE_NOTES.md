# Release Notes

This repository provides the Java and Kotlin challenge content for the
[ReadingBat](https://github.com/readingbat/readingbat-core) platform. It evolves
continuously and tracks the readingbat-core releases it depends on. These notes
summarize the notable milestones in narrative form. For the full, dated list of
changes, see [CHANGELOG.md](CHANGELOG.md).

---

## v1.2.0 (October 2026)

A dependency release that turned into a memory investigation. Moving to readingbat-core
3.5.0 and Kotlin 2.4.21 made `ContentTests` fail partway through the Kotlin sweep with
`OutOfMemoryError`, and a larger test heap did not help: with 2 GB, full collections
freed almost nothing, and the heap stayed full.

The cause is a regression in Kotlin's JSR-223 script engine, which readingbat-core uses
to compute each Kotlin challenge's answers. From Kotlin 2.4.20 the engine is built on the
K2 REPL, and every new script state builds a complete compiler environment (a project,
FIR sessions, and an index of the whole classpath) that is never disposed, so each one
stays reachable for the life of the JVM, about 27 MB apiece here. readingbat-core resets
its pooled engine after every challenge, which starts a new state, so the sweep piled up
an environment per Kotlin challenge. The 2.4.10 engine released the same states, and
creating a fresh engine per script leaks just as badly on 2.4.21, so this is Kotlin's,
not the pooling's.

The fix keeps the runtime scripting jars on 2.4.10 while everything else moves forward.
A new `kotlin-scripting` catalog version is applied by `configureScripting()` to the
runtime and test classpaths only, so the project still compiles with Kotlin 2.4.21 and
challenge code is compiled by the 2.4.10 engine. With the pin in place the full suite
passes in about 30 seconds. The pin is temporary: it can go once a Kotlin release disposes
the state, or once readingbat-core carries the same pin itself.

Two build changes ship alongside. `make versions` now lists only what is behind (plus
anything it could not check and a pending Gradle upgrade), and `make versions-all` keeps
the versions plugin's full report. `gradle.properties` turns the Gradle configuration
cache on and gives the Gradle and Kotlin daemons a 6 GB heap with heap dumps on
`OutOfMemoryError`.

Dependencies: readingbat-core 3.5.0, Kotlin 2.4.21 (scripting runtime held at 2.4.10),
common-utils 5.1.1, the versions plugin 0.66.0, and the Gradle wrapper 9.8.1. No
challenge content changed in this release.

## v1.1.0 (September 2026)

A test-reliability release, prompted by a CI failure on a pull request that contained no
code at all. `ContentTests` verified the entire catalog in a single `Test all challenges`
body, and on a slow runner that sweep drifted past a timeout nobody had set deliberately.
Ktor's `testApplication` is `runTestWithRealTime { runTestApplication(..) }`, and the
wrapper imposes `runTest`'s 60-second default — a ceiling a Kotest timeout cannot raise,
so the build failed with `UncompletedCoroutinesError` rather than an assertion.

The fix addresses both halves of the problem. The sweep is now split per language, so the
largest single body (Java, 11.4s locally) takes a little over half the time the combined
one did, and a failure names the language that broke rather than just "all challenges".
Both sweeps then await `runTestApplication` directly, which drops the hidden ceiling and
leaves an explicit 5-minute timeout as the only governing limit — confirmed by setting it
to one second and watching Kotest's own spec-scope timeout replace the coroutine error.
Because the two cases name `content.java` and `content.kotlin` explicitly, a new
`Per-language tests cover every challenge` guard fails the suite if a language added to
`Content.kt` would otherwise go silently untested.

The release also adds the repository's first `.gitattributes`. `gradlew.bat` had been
stored with LF endings, which `cmd.exe` mis-parses around labels and multi-line `set`
blocks — a latent break that Linux-only CI would never have surfaced. Stored blobs are
now normalized to LF, `*.bat` is checked out CRLF, and `*.jar` is pinned binary.

Dependencies moved forward as well: readingbat-core 3.4.0, Ktor 3.6.0, Kotest 6.2.5,
kotlinter 5.7.0, detekt 2.0.0-alpha.6, and the Gradle wrapper 9.7.1. No challenge content
changed in this release.

## v1.0.1 (August 2026)

A documentation correctness pass, with no content or build changes. Tagging `1.0.0`
prompted an audit of the project's machine-readable summary, which turned out to have
drifted: `llms.txt` still described the JVM toolchain as 17 (it moved to 25 with the JDK
25 bump) and advertised a `make versioncheck` target that does not exist. Both are fixed,
and `llms.txt` now defers to `gradle/libs.versions.toml` and `make help` rather than
restating values that drift. It also picked up the challenge naming contract, the Kotlin
`returnType` requirement, and the detekt/kotlinter gates. `README.md` and `CLAUDE.md`
gained short notes on how versioning and changelog upkeep work.

## v1.0.0 (August 2026)

The first tagged release. The repository ran untagged for six years, so `1.0.0`
is a baseline marking the current state rather than a feature milestone — it
captures the content catalog and build as they stand after the 2026 expansion and
tooling work described below. Future changes will be versioned from here.

The release itself gathers the build and dependency work that followed the March
2026 content expansion: the JVM toolchain and CI both moved to **JDK 25**, the
Gradle wrapper reached 9.6.1, `build.gradle.kts` was refactored into `configure*`
extension functions with Ktor's `fatJar` block, the obsolete Heroku Makefile
targets were dropped, and readingbat-core advanced to 3.3.1 alongside
common-utils 3.2.2, Kotest 6.2.3, Kotlin 2.4.10, and Ktor 3.5.1.

## Content and DX focus (2026)

2026 has been the most active year for the project since its founding, shifting
emphasis from pure maintenance to content and developer experience.

- **A large content expansion** in March 2026 added 126 new challenges across 15
  new topics. The Kotlin side in particular grew well beyond the basics to cover
  scope functions (`let`/`run`/`also`/`with`), fold and reduce, zip and partition,
  collection transformations, ranges, null safety, when expressions, and string
  templates. Groups were reordered by difficulty so learners progress from warmups
  outward, and every challenge gained a `@desc` hint that surfaces guidance in the UI.
- **Developer experience** was overhauled: the test suite was rewritten in the
  Kotest `StringSpec` style, `CLAUDE.md` and `llms.txt` were added for AI-assisted
  workflows, detekt and kotlinter were wired in for static analysis and formatting,
  and a CI workflow now runs tests and lint on every push and pull request.
- **Housekeeping** included migrating packages off the `com.github` namespace,
  renaming packages to idiomatic camelCase, centralizing all tool and dependency
  versions in `gradle/libs.versions.toml`, and adding a self-documenting Makefile.

## Build modernization (2024–2025)

The build was brought fully up to date with the modern Kotlin and Ktor ecosystems.
The project moved from a Groovy `build.gradle` to the Kotlin DSL with a Gradle
version catalog, upgraded to Kotlin 2.x, Ktor 3.x, and Kotest 6, and adopted
Gradle 9. readingbat-core advanced through its 2.x line during this period.

## Steady maintenance (2021–2023)

For several years the repository was kept current with the platform: Kotlin was
upgraded from 1.5 through the 1.9 series, readingbat-core moved to 1.11.1 and
beyond, `funcSum` exercises were added, and dependencies were refreshed regularly.

## Test coverage (late 2020)

`ContentTests.kt` established automated validation of the entire challenge catalog.
Running against a Ktor test host, it verifies that empty submissions report as
not answered, wrong submissions as incorrect, and the expected outputs as correct —
turning every challenge's `main()` output into an enforced answer key.

## Initial release (April 2020)

The repository launched as a content definition built on the `readingBatContent`
DSL. The first groups covered the Java fundamentals — warmups, boolean expressions,
math, if/switch statements, loops, strings, arrays, and recursion — with Gitpod and
Code Runner set up for a browser-based development experience. Released under the
Apache License 2.0.
