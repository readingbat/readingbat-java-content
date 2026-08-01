/*
 * Copyright © 2020 Paul Ambrose (pambrose@mac.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

import com.readingbat.dsl.LanguageGroup
import com.readingbat.kotest.TestSupport.answerAllWith
import com.readingbat.kotest.TestSupport.answerAllWithCorrectAnswer
import com.readingbat.kotest.TestSupport.forEachAnswer
import com.readingbat.kotest.TestSupport.forEachChallenge
import com.readingbat.kotest.TestSupport.forEachGroup
import com.readingbat.kotest.TestSupport.forEachLanguage
import com.readingbat.kotest.TestSupport.initTestProperties
import com.readingbat.kotest.TestSupport.shouldHaveAnswer
import com.readingbat.kotest.TestSupport.testModule
import com.readingbat.posts.AnswerStatus
import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.config.TestConfig
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeBlank
import io.ktor.server.testing.ApplicationTestBuilder
import io.ktor.server.testing.runTestApplication
import io.ktor.server.testing.testApplication
import kotlin.time.Duration.Companion.minutes

class ContentTests : StringSpec() {
  private companion object {
    // Each sweep takes ~10s locally and CI runs several times slower. This is sized to
    // absorb that without flaking, while still failing on a genuine hang.
    val CHALLENGE_SWEEP_TIMEOUT = 5.minutes
  }

  // Challenges are exercised one language at a time rather than in a single sweep, and
  // the two sweeps set their own timeout instead of inheriting a hidden one.
  //
  // `testApplication` is `runTestWithRealTime { runTestApplication(..) }`, and that
  // wrapper is what applies runTest's 60s default — a Kotest timeout cannot raise it,
  // so a slow CI runner failed with UncompletedCoroutinesError rather than an
  // assertion. `runTestApplication` is the same public entry point without the wrapper,
  // and because a Kotest test body is already a coroutine it can be awaited directly.
  // That leaves CHALLENGE_SWEEP_TIMEOUT as the single governing limit.
  private fun LanguageGroup<*>.verifyAllChallenges(engine: ApplicationTestBuilder) =
    forEachGroup {
      forEachChallenge {
        answerAllWith(engine, "") {
          answerStatus shouldBe AnswerStatus.NOT_ANSWERED
          hint.shouldBeBlank()
        }

        answerAllWith(engine, "wrong answer") {
          answerStatus shouldBe AnswerStatus.INCORRECT
        }

        answerAllWithCorrectAnswer(engine) {
          answerStatus shouldBe AnswerStatus.CORRECT
          hint.shouldBeBlank()
        }
      }
    }

  private val LanguageGroup<*>.challengeCount: Int
    get() = challengeGroups.sumOf { it.challenges.size }

  init {
    beforeEach { initTestProperties() }

    "Test all Java challenges".config(TestConfig(timeout = CHALLENGE_SWEEP_TIMEOUT)) {
      runTestApplication {
        application {
          testModule(content)
        }

        content.java.verifyAllChallenges(this@runTestApplication)
      }
    }

    "Test all Kotlin challenges".config(TestConfig(timeout = CHALLENGE_SWEEP_TIMEOUT)) {
      runTestApplication {
        application {
          testModule(content)
        }

        content.kotlin.verifyAllChallenges(this@runTestApplication)
      }
    }

    // The two tests above name content.java and content.kotlin explicitly, so a
    // language added to Content.kt would otherwise go silently untested.
    "Per-language tests cover every challenge" {
      val covered = content.java.challengeCount + content.kotlin.challengeCount
      content.languages.sumOf { it.challengeCount } shouldBe covered
    }

    "Test with correct answers" {
      testApplication {
        application {
          testModule(content)
        }

        content.forEachLanguage {
          forEachGroup {
            forEachChallenge {
              forEachAnswer {
                it shouldHaveAnswer correctAnswers()[it.index]
              }
            }
          }
        }
      }
    }

    "Test individual challenges" {
      testApplication {
        application {
          testModule(content)
        }

        /*
        content.javaChallenge("Group 1", "find_it") {
          answerFor(0) shouldNotHaveAnswer "true"
          answerFor(1) shouldNotHaveAnswer "false"

          answerFor(0) shouldHaveAnswer "False"
          answerFor(1) shouldHaveAnswer "True"
          answerFor(2) shouldHaveAnswer "False"
          answerFor(3) shouldHaveAnswer "True"
          answerFor(4) shouldHaveAnswer "False"
        }

        content.kotlinChallenge("Group 1", "find_it") {
          answerFor(0) shouldNotHaveAnswer "true"
          answerFor(1) shouldNotHaveAnswer "false"

          answerFor(0) shouldHaveAnswer "False"
          answerFor(1) shouldHaveAnswer "True"
          answerFor(2) shouldHaveAnswer "False"
          answerFor(3) shouldHaveAnswer "True"
          answerFor(4) shouldHaveAnswer "False"
        }
        */
      }
    }
  }
}
