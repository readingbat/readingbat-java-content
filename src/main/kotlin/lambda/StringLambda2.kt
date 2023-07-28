package lambda

fun String.combine2(): String = chunked(1).mapIndexed { i, s -> i.toString() + s }.joinToString(", ")

fun main() {
  println("g".combine2())
  println("house".combine2())
}