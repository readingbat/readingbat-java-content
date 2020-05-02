import com.github.readingbat.ReturnType
import com.github.readingbat.dsl.readingBatContent

val content2 =
  readingBatContent {

    kotlin {
      repoRoot = "https://github.com/readingbat/readingbat-java-content"

      group("Lambdas 1") {
        packageName = "lambda1"
        description = "This is a description of Lambdas 1"

        challenge("StringLambda1") {
          description = "This is a description of StringLambda1"

          "" returns "0a"
          "" returns "0a, 1b, 2c, 3d"
        }

        challenge("StringLambda2") {
          description = "This is a description of StringLambda1"

          "" returns "0g"
          "" returns "0h, 1o, 2u, 3s, 4e"
        }

      }

      group("Lambdas 2") {
        packageName = "lambdas2"
        description = "This is a description of Lambdas 2"
      }
    }

    java {
      repoRoot = "https://github.com/readingbat/readingbat-java-content"

      group("Warmup 1") {
        packageName = "warmup1"
        description = "This is a description of Warmup 1"

        challenge("JoinEnds") {
          description = """This is a description of JoinEnds"""
          codingBatEquiv = "p141494"
          returnType = ReturnType.StringType
        }

        challenge("StringLength") {
          description = """This is a description of StringLength"""
          codingBatEquiv = "p141494"
          returnType = ReturnType.IntType
        }

        challenge("LookForIt") {
          description = """This is a description of LookForIt"""
          returnType = ReturnType.BooleanType

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
  }