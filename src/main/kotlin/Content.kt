import com.github.pambrose.common.util.GitHubRepo
import com.github.readingbat.dsl.ReturnType.StringType
import com.github.readingbat.dsl.readingBatContent

val branch = "dev"

val content =
  readingBatContent {

    java {
      repo = GitHubRepo("readingbat", "readingbat-java-content")
      branchName = branch

      group("Warmup 1") {
        packageName = "warmup1"
        description = "This is a description of Warmup 1"

        challenge("JoinEnds") {
          description = """This is a description of JoinEnds"""
          codingBatEquiv = "p141494"
        }

        challenge("StringLength") {
          description = """This is a description of StringLength"""
          codingBatEquiv = "p141494"
        }

        challenge("LookForIt") {
          description = """This is a description of LookForIt"""
        }

        challenge("Shifty") {
          description = """This is a description of Shifty"""
        }

        challenge("HasEvens") {
          description = """This is a description of HasEvens"""
        }

        challenge("HasOdds") {
          description = """This is a description of HasOdds"""
        }
      }

      group("Warmup 2") {
        packageName = "warmup2"
        description = "This is a description of Warmup 2"
      }

      group("Logic 1") {
        packageName = "logic1"
        description = "This is a description of Logic 1"
      }

      group("Logic 2") {
        packageName = "logic2"
        description = "This is a description of Logic 2"
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
      repo = GitHubRepo("readingbat", "readingbat-java-content")
      branchName = branch

      group("Lambdas 1") {
        packageName = "lambda1"
        description = "This is a description of Lambdas 1"

        challenge("StringLambda1") {
          description = "This is a description of StringLambda1"
          returnType = StringType
        }

        challenge("StringLambda2") {
          description = "This is a description of StringLambda1"
          returnType = StringType
        }
      }

      group("Lambdas 2") {
        packageName = "lambdas2"
        description = "This is a description of Lambdas 2"
      }
    }
  }