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

            group("Warmup 1") {
                packageName = "warmup1"
                description = "Warmup 1 Challenges"

                challenge("SayGoodbye")

                challenge("JoinEnds") {
                    codingBatEquiv = "p163411"
                }

                challenge("AddItUp")

                challenge("StringLength") {
                    codingBatEquiv = "p172267"
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

            group("Math Operations") {
                packageName = "math_ops"
                description = "Math methods and arithmetic"

                includeFiles = "MathOps*.java"
            }

            group("If Statements") {
                packageName = "if_stmts"
                description = "Basic if statements"

                includeFiles = "IfStmt*.java"
            }

            group("Switch Statements") {
                packageName = "switch_stmts"
                description = "Switch/case statements"

                includeFiles = "Switch*.java"
            }

            group("For Loops") {
                packageName = "for_loops"
                description = "Basic for loops"

                includeFiles = "ForLoop*.java"
            }

            group("While Loops") {
                packageName = "while_loops"
                description = "While loop fundamentals"

                includeFiles = "WhileLoop*.java"
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

                includeFiles = "IndexOf*.java"

                challenge("Replace1")

                challenge("Trim1")

                challenge("CharAt1")
            }

            group("Character Operations") {
                packageName = "char_ops"
                description = "Character testing and manipulation"

                includeFiles = "Char*.java"
            }

            group("Arrays") {
                packageName = "arrays"
                description = "Array operations"

                includeFiles = "Array*.java"
            }

            group("Nested Loops") {
                packageName = "nested_loops"
                description = "Nested loop patterns"

                includeFiles = "NestedLoop*.java"
            }

            group("Recursion") {
                packageName = "recursion"
                description = "Recursive functions"

                includeFiles = "Recursion*.java"
            }

            group("2D Arrays") {
                packageName = "arrays_2d"
                description = "Two-dimensional array operations"

                includeFiles = "Array2D*.java"
            }
        }

        kotlin {

            group("String Templates") {
                packageName = "string_templates"
                description = "Kotlin string template expressions"

                includeFilesWithType = "Template*.kt" returns StringType
            }

            group("When Expressions") {
                packageName = "when_exprs"
                description = "Kotlin when expressions"

                includeFilesWithType = "When*.kt" returns StringType

                challenge("When5") {
                    returnType = IntType
                }
            }

            group("Ranges") {
                packageName = "ranges"
                description = "Kotlin ranges and progressions"

                challenge("Range1") {
                    returnType = IntListType
                }

                challenge("Range2") {
                    returnType = IntListType
                }

                challenge("Range3") {
                    returnType = IntListType
                }

                challenge("Range4") {
                    returnType = IntListType
                }

                challenge("Range5") {
                    returnType = IntListType
                }

                challenge("Range6") {
                    returnType = StringType
                }

                challenge("Range7") {
                    returnType = IntListType
                }
            }

            group("Null Safety") {
                packageName = "null_safety"
                description = "Kotlin null safety operators"

                challenge("NullSafe1") {
                    returnType = IntType
                }

                challenge("NullSafe2") {
                    returnType = StringType
                }

                challenge("NullSafe3") {
                    returnType = IntType
                }

                challenge("NullSafe4") {
                    returnType = IntType
                }

                challenge("NullSafe5") {
                    returnType = IntListType
                }

                challenge("NullSafe6") {
                    returnType = StringListType
                }
            }

            group("Lambda Intro") {
                packageName = "intro"
                description = "Introduction to Lambdas"

                includeFilesWithType = "NoArgLambda*.kt" returns IntType
                includeFilesWithType = "IntLambda*.kt" returns IntType
                includeFilesWithType = "StringLambda*.kt" returns StringType
                includeFilesWithType = "IntListLambda*.kt" returns IntListType
            }

            group("Misc Lambdas") {
                packageName = "lambda"
                description = "Miscellaneous Lambdas"

                challenge("StringLambda1") {
                    returnType = StringType
                }

                challenge("StringLambda2") {
                    returnType = StringType
                }
            }

            group("Strings") {
                packageName = "strings"
                description = "Strings"

                includeFilesWithType = "String*.kt" returns StringType
                includeFilesWithType = "FuncSum*.kt" returns IntType

                challenge("LambdaReturn1") {
                    returnType = StringType
                }
                challenge("LambdaReturn2") {
                    returnType = IntType
                }
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

                challenge("FlatMap1") {
                    returnType = StringType
                }

                challenge("GroupBy1") {
                    returnType = StringType
                }

                challenge("Associate1") {
                    returnType = StringType
                }

                challenge("Sorted1") {
                    returnType = StringListType
                }

                challenge("Distinct1") {
                    returnType = StringType
                }
            }

            group("Fold and Reduce") {
                packageName = "fold_reduce"
                description = "Accumulator patterns with fold and reduce"

                challenge("Fold1") {
                    returnType = IntType
                }

                challenge("Fold2") {
                    returnType = StringType
                }

                challenge("Fold3") {
                    returnType = IntType
                }

                challenge("Fold4") {
                    returnType = IntType
                }

                challenge("Reduce1") {
                    returnType = IntType
                }

                challenge("Reduce2") {
                    returnType = StringType
                }

                challenge("FoldReduce1") {
                    returnType = IntType
                }
            }

            group("Zip and Partition") {
                packageName = "zip_partition"
                description = "Pairing and splitting collections"

                challenge("Zip1") {
                    returnType = StringType
                }

                challenge("Zip2") {
                    returnType = IntListType
                }

                challenge("Zip3") {
                    returnType = StringListType
                }

                challenge("Partition1") {
                    returnType = StringType
                }

                challenge("Partition2") {
                    returnType = StringType
                }

                challenge("Unzip1") {
                    returnType = StringType
                }
            }

            group("Scope Functions") {
                packageName = "scope_funcs"
                description = "Kotlin scope functions: let, run, also, with"

                challenge("Let1") {
                    returnType = StringType
                }

                challenge("Let2") {
                    returnType = IntType
                }

                challenge("Let3") {
                    returnType = StringType
                }

                challenge("Run1") {
                    returnType = StringType
                }

                challenge("Also1") {
                    returnType = StringType
                }

                challenge("With1") {
                    returnType = StringType
                }
            }
        }
    }
