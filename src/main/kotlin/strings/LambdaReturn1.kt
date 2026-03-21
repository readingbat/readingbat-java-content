package strings
// @desc The function returns a lambda — call **.invoke()** or **()** on it to get the actual string result.

fun lambdaReturn1(word: String): () -> String = { word + word }

fun main() {
    println(lambdaReturn1("hello").invoke())
    println(lambdaReturn1("hi")())
    println({ lambdaReturn1("there")() }.invoke())
    println({ lambdaReturn1("world").invoke() }())
}