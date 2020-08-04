import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
import com.github.pambrose.common.util.OwnerType.Organization
import com.github.readingbat.dsl.ReturnType.*
import com.github.readingbat.dsl.isProduction
import com.github.readingbat.dsl.readingBatContent

val content =
  readingBatContent {
    repo =
      if (isProduction())
        GitHubRepo(Organization, "readingbat", "readingbat-java-content")
      else
        FileSystemSource("./")

    java {

      group("Boolean Expressions") {
        packageName = "boolean_exprs"
        description = "Basic boolean expressions"

        challenge("LessThan")

        challenge("GreaterThan")

        challenge("LessThanOrEqual")

        challenge("GreaterThanOrEqual")

        challenge("Equal")

        challenge("NotEqual")

        includeFiles = "Modulo*.java"

        includeFiles = "AndOr*.java"
      }

      group("If Statements") {
        packageName = "if_stmts"
        description = "Basic if statements"

        includeFiles = "IfStmt*.java"
      }

      group("For Loops") {
        packageName = "for_loops"
        description = "Basic for loops"

        includeFiles = "ForLoop*.java"
      }

      group("Warmup 1") {
        packageName = "warmup1"
        description = "This is a description of Warmup 1"

        challenge("JoinEnds") {
          codingBatEquiv = "p141494"
        }

        challenge("AddItUp")

        challenge("StringLength") {
          codingBatEquiv = "p141494"
        }

        challenge("LookForIt")

        challenge("Shifty")

        challenge("HasEvens")

        challenge("HasOdds")
      }

      group("String Operations") {
        packageName = "string_operations"
        description = "This is a description of String Operations"

        challenge("GoodbyeName")

        includeFiles = "Combine*.java"

        includeFiles = "Concat*.java"

        includeFiles = "Strlen*.java"

        challenge("StartsWith")

        challenge("EndsWith")

        challenge("ContainsOper")

        includeFiles = "Slice*.java"

        challenge("Split")
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
