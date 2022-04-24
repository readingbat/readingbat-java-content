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

            group("String Operations") {
                packageName = "string_ops"
                description = "Basic String Operations"

                challenge("StartsWith")

                challenge("EndsWith")

                challenge("Contains")

                includeFiles = "Strlen*.java"

                includeFiles = "Substr*.java"

                includeFiles = "Concat*.java"

                challenge("Split")
            }

            group("Warmup 1") {
                packageName = "warmup1"
                description = "Warmup 1 Challenges"

                challenge("SayGoodbye")

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

                challenge("FirstLast")

                challenge("UpperLower")

                challenge("Matching")

                includeFiles = "Searching*.java"

                challenge("MixString") {
                    codingBatEquiv = "p125185"
                }
            }

            group("Warmup 2") {
                packageName = "warmup2"
                description = "Warmup 2 Challenges"

                includeFiles = "*.java"
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

            group("Collection Transformations") {
                packageName = "transformations"
                description = "Basic collection transformations"

                challenge("Map1") {
                    returnType = IntListType
                }

                challenge("Map2") {
                    returnType = BooleanListType
                }

                challenge("Filter1") {
                    returnType = IntType
                }

                challenge("Filter2") {
                    returnType = StringListType
                }

                challenge("MapFilter1") {
                    returnType = IntListType
                }

                challenge("Chain1") {
                    returnType = StringType
                }

                challenge("Chain2") {
                    returnType = StringType
                }
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

            group("Strings") {
                packageName = "Strings"
                description = "Strings"
                includeFilesWithType = "String*.kt" returns StringType

                challenge("LambdaReturn1") {
                    returnType = StringType
                }
                challenge("LambdaReturn2") {
                    returnType = IntType
                }
            }
        }
    }