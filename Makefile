.PHONY: default help clean build lint format detekt detekt-baseline tests uberjar uber \
        cc run versions upgrade-wrapper

GRADLE_VERSION := $(shell sed -n 's/^gradle-wrapper = "\(.*\)"/\1/p' gradle/libs.versions.toml)

default: help

help:  ## Show this help (list of targets)
	@awk 'BEGIN {FS = ":.*?## "; printf "Usage: make <target>\n\nTargets:\n"} \
		/^[a-zA-Z0-9_-]+:.*?## / {printf "  \033[36m%-22s\033[0m %s\n", $$1, $$2}' $(MAKEFILE_LIST)

clean: ## Remove Gradle build outputs
	./gradlew clean

build: ## Compile without running tests
	./gradlew build -x test

lint: ## Run Kotlinter and detekt
	./gradlew lintKotlin detekt

format: ## Format Kotlin sources with kotlinter
	./gradlew formatKotlin

detekt: ## Run detekt static analysis
	./gradlew detekt

detekt-baseline: ## Generate detekt baseline file
	./gradlew detektBaseline

tests: ## Run all tests
	./gradlew --rerun-tasks check

uberjar: ## Build fat jar at build/libs/server.jar
	./gradlew uberjar

uber: uberjar ## Build uberjar and run it
	java -jar build/libs/server.jar

cc: ## Continuous compilation (watches for changes)
	./gradlew build --continuous -x test

run: ## Start the content server locally (port 8080)
	./gradlew run

versions: ## Check for dependency updates
	./gradlew dependencyUpdates --no-configuration-cache --no-parallel

upgrade-wrapper: _require-gradle-version ## Upgrade the Gradle wrapper to the catalog version
	# Gradle's documented upgrade procedure: the first run rewrites
	# gradle-wrapper.properties using the *old* wrapper jar; the second run
	# regenerates the wrapper itself with the new version.
	./gradlew wrapper --gradle-version=$(GRADLE_VERSION) --distribution-type=bin
	./gradlew wrapper --gradle-version=$(GRADLE_VERSION) --distribution-type=bin

_require-gradle-version:
	@[ -n "$(GRADLE_VERSION)" ] || { echo "ERROR: Could not determine gradle version from gradle/libs.versions.toml" >&2; exit 1; }
