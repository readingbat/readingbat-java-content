package lambda

// @desc **mapIndexed** gives you both the index and the element — trace what gets combined at each position.

fun List<String>.combine(): String = mapIndexed { i, s -> i.toString() + s }.joinToString(", ")

fun main() {
  println(listOf("a").combine())
  println(listOf("a", "b", "c", "d").combine())
}