package strings
// @desc The returned lambda captures the input string and computes its **length** when invoked.

fun lambdaReturn2(word: String): () -> Int = { word.length }

fun main() {
    println(lambdaReturn2("hello").invoke())
    println(lambdaReturn2("hi")())
    println({ lambdaReturn2("there")() }.invoke())
    println({ lambdaReturn2("world").invoke() }())
}