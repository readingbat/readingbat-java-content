import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
import com.github.readingbat.dsl.ReturnType.*
import com.github.readingbat.dsl.isProduction
import com.github.readingbat.dsl.readingBatContent

val content =
  readingBatContent {
    repo = if (isProduction()) GitHubRepo("readingbat", "readingbat-java-content") else FileSystemSource("./")
    branchName = "master"

    java {

      group("Warmup 1 PAUL") {
        packageName = "warmup1"
        description = "This is a description of Warmup 1"

        challenge("JoinEnds") {
          codingBatEquiv = "p141494"
        }

        challenge("AddItUp")

        challenge("StringLength") {
          description = "This is a description of StringLength"
          codingBatEquiv = "p141494"
        }

        challenge("LookForIt") {
          description = "This is a description of LookForIt"
        }

        challenge("Shifty") {
          description = "This is a description of Shifty"
        }

        challenge("HasEvens") {
          description = "This is a description of HasEvens"
        }

        challenge("HasOdds") {
          description = "This is a description of HasOdds"
        }
      }

      group("String 1") {
        packageName = "string1"
        description = "This is a description of String 1"
      }

      group("String 2") {
        packageName = "string2"
        description = "This is a description of String 2"
      }

      group("Array 1") {
        packageName = "array1"
        description = "This is a description of Array 1"
      }

      group("Array 2") {
        packageName = "array2"
        description = "This is a description of Array 2"
      }
    }

    kotlin {

      group("Lambda Intro") {
        packageName = "intro"
        description = "Introduction to Lambdas"

        includeFilesWithType = "NoArgLambda*.kt" returns IntType
        includeFilesWithType = "IntLambda*.kt" returns IntType
        includeFilesWithType = "StringLambda*.kt" returns StringType
        includeFilesWithType = "IntListLambda*.kt" returns IntListType
      }

      group("Misc Lambdas") {
        packageName = "lambda1"
        description = "Miscellaneous Lambdas"

        challenge("StringLambda1") {
          returnType = StringType
        }

        challenge("StringLambda2") {
          returnType = StringType
        }
      }
    }
  }
