# Release Notes

This repository provides the Java and Kotlin challenge content for the
[ReadingBat](https://github.com/readingbat/readingbat-core) platform. It is not
formally versioned or tagged; instead, it evolves continuously and tracks the
readingbat-core releases it depends on. These notes summarize the notable
milestones in narrative form. For the full, dated list of changes, see
[CHANGELOG.md](CHANGELOG.md).

---

## Current focus (2026)

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
