package strings

fun funcSum1(funcs: List<() -> Int>): Int =
    funcs.map { it() }.sum()

fun main() {
    println(funcSum1(listOf({ 5 }, { 3 })))
    println(funcSum1(listOf({ 8 }, { 6 }, { 11 })))
    println(funcSum1(listOf({ 1 }, { 2 }, { 3 }, { 4 })))
    println(funcSum1(listOf({ 9 }, { 9 })))
}