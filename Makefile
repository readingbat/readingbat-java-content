.PHONY: default clean build tests uberjar uber cc run heroku logs versioncheck upgrade-wrapper

GRADLE_VERSION := $(shell grep '^gradle = ' gradle/libs.versions.toml | cut -d'"' -f2)

default: versioncheck

clean:
	./gradlew clean

build:
	./gradlew build -xtest

lint: ## Run Kotlinter and detekt
	./gradlew lintKotlin detekt

format: ## Format Kotlin sources with kotlinter
	./gradlew formatKotlin

detekt: ## Run detekt static analysis
	./gradlew detekt

detekt-baseline: ## Generate detekt baseline file
	./gradlew detektBaseline

tests:
	./gradlew --rerun-tasks check

uberjar:
	./gradlew uberjar

uber: uberjar
	java -jar build/libs/server.jar

cc:
	./gradlew build --continuous -xtest

run:
	./gradlew run

heroku:
	git push heroku master

logs:
	heroku logs --tail

versioncheck:
	./gradlew dependencyUpdates

upgrade-wrapper:
	./gradlew wrapper --gradle-version=$(GRADLE_VERSION) --distribution-type=bin
