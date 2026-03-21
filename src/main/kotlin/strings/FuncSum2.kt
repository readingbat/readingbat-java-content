package strings
// @desc **sumOf** calls each lambda and adds up all the returned values in one step.

fun funcSum2(funcs: List<() -> Int>): Int =
    funcs.sumOf { it() }

fun main() {
    println(funcSum2(listOf({ 5 }, { 3 })))
    println(funcSum2(listOf({ 8 }, { 6 }, { 11 })))
    println(funcSum2(listOf({ 1 }, { 2 }, { 3 }, { 4 })))
    println(funcSum2(listOf({ 9 }, { 9 })))
}