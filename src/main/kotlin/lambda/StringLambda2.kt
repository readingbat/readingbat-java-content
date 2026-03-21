package lambda

// @desc **chunked(1)** splits a string into single characters — then **mapIndexed** pairs each with its position.

fun String.combine2(): String = chunked(1).mapIndexed { i, s -> i.toString() + s }.joinToString(", ")

fun main() {
  println("g".combine2())
  println("house".combine2())
}