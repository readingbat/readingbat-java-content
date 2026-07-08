# Changelog

All notable changes to this repository are documented here.

The format is loosely based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/).
This repository has never used version tags or formal releases, so entries are
grouped by date and milestone rather than semantic version. The content tracks
the [readingbat-core](https://github.com/readingbat/readingbat-core) platform, so
many entries reflect dependency and toolchain upgrades.

## [Unreleased]

### Changed
- Bumped the Gradle JVM toolchain to **25**.
- Upgraded dependencies: readingbat-core `3.1.8` → `3.2.1`, common-utils `2.9.0` → `2.9.3`,
  Ktor `3.5.0` → `3.5.1`, Kotest `6.1.11` → `6.2.1`, detekt `2.0.0-alpha.3` → `2.0.0-alpha.5`,
  and the Gradle wrapper `9.5.1` → `9.6.1`.

## 2026-06 — Tooling polish

### Changed
- Reworked the Makefile: added a self-documenting `help` target and cleaned up the build targets (#14).

## 2026-05 — CI, linting, and package conventions

### Added
- CI workflow that runs tests and lint on every push and pull request (#13).
- Lint and format tooling: detekt static analysis and kotlinter formatting, wired into the build (#12).

### Changed
- Renamed packages to camelCase for idiomatic consistency (#12).
- Centralized the Gradle and JVM versions in `gradle/libs.versions.toml` (#11).
- Refreshed build configuration and documentation (#10).
- Upgraded the Gradle wrapper to `9.5.0`.

## 2026-04 — Namespace migration

### Changed
- Migrated packages off the `com.github` namespace to the project's own namespaces.
- Bumped readingbat-core through `3.1.1` → `3.1.2` → `3.1.4`, plus Kotlin, Ktor, common-utils, and the versions plugin.
- Cleaned up `.gitignore`.

### Added
- `readingbat-kotest` test dependency for challenge validation helpers.

## 2026-03 — Major content expansion & pedagogy

### Added
- **126 new challenges across 15 new topics**, spanning both Java and Kotlin groups
  (including Kotlin scope functions, fold/reduce, zip/partition, collection transformations,
  ranges, null safety, when expressions, and string templates).
- Pedagogical `@desc` hints on every challenge file so students see guidance in the UI.
- Project guidance files: `CLAUDE.md` and `llms.txt`.

### Changed
- Reordered groups by difficulty — warmups first, then easiest to hardest.
- Rewrote the test suite to Kotest `StringSpec` `init {}` style.
- Bumped readingbat-core to `3.0.4`, then `3.0.5`.
- Upgraded the Gradle wrapper to `9.4.0` / `9.4.1`; enabled the Gradle daemon,
  configure-on-demand, and build caching.
- Simplified `ContentServer`.

### Fixed
- Corrected challenge metadata and assorted bugs.
- Normalized blank-line spacing above `@desc` in Kotlin challenge files.

## 2025 — Build modernization

### Changed
- Converted the Groovy `build.gradle` to Kotlin DSL (`build.gradle.kts`) and adopted a
  Gradle version catalog (`gradle/libs.versions.toml`).
- Upgraded to Kotlin `2.2.x`, Ktor `3.x`, and Kotest `6.0.0`.
- Upgraded the Gradle wrapper to `9.0.0`.
- Changed the group ID to `com.github.pambrose.readingbat`.
- Bumped readingbat-core into the `2.1.x` line.

## 2024 — Kotlin 2.x and Ktor 3

### Changed
- Upgraded Kotlin `2.0.0` → `2.1.0`.
- Adopted Ktor `3.0.1`.
- Upgraded readingbat-core to `2.0.0`.

## 2021–2023 — Ongoing maintenance

### Added
- `funcSum` exercises.

### Changed
- Upgraded Kotlin from `1.5.0` through the `1.9.x` line.
- Upgraded readingbat-core to `1.11.1` and beyond.
- Updated package names and cleaned up the build script.
- Regular dependency ("jar") refreshes.

### Fixed
- Assorted typos and Java challenge corrections.

## 2020-11 — Test suite

### Added
- `ContentTests.kt` — a Kotest suite that validates every challenge through a Ktor
  test host (empty answers report `NOT_ANSWERED`, wrong answers `INCORRECT`, correct
  answers `CORRECT`).
- Dedicated test content.

## 2020-04 — Initial release

### Added
- Initial content repository built on the `readingBatContent` DSL in `Content.kt`.
- First Java challenge groups: warmups, boolean expressions, math operations, if/switch
  statements, for/while/nested loops, string and character operations, arrays, and recursion.
- Gitpod configuration and the Code Runner setup for local development.
- Apache License 2.0.
