plugins {
  java
  application
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.versions)
}

// This is for ./gradlew run
application {
  mainClass.set("ContentServer")
}

group = "com.github.readingbat"
version = "1.0"

repositories {
  google()
  mavenCentral()
  maven { url = uri("https://jitpack.io") }
}

dependencies {
  implementation(libs.readingbat.core)
  implementation(libs.core.utils)
  implementation(libs.kotlin.logging)
}

kotlin {
  jvmToolchain(17)
}

tasks.test {
  useJUnitPlatform()

  testLogging {
    events("passed", "skipped", "failed", "standardOut", "standardError")
    exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    showStandardStreams = true
  }
}