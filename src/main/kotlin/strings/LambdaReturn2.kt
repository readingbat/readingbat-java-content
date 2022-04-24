package strings

fun lambdaReturn2(word: String): () -> Int = { word.length }

fun main() {
    println(lambdaReturn2("hello").invoke())
    println(lambdaReturn2("hi")())
    println({ lambdaReturn2("there")() }.invoke())
    println({ lambdaReturn2("world").invoke() }())
}