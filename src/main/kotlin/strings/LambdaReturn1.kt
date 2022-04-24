package strings

fun lambdaReturn1(word: String): () -> String = { word + word }

fun main() {
    println(lambdaReturn1("hello").invoke())
    println(lambdaReturn1("hi")())
    println({ lambdaReturn1("there")() }.invoke())
    println({ lambdaReturn1("world").invoke() }())
}