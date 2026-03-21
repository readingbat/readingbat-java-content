package ranges

// @desc **until** excludes the end value — **(0 until 5)** gives 0, 1, 2, 3, 4 but not 5.

fun range4(n: Int): List<Int> = (0 until n).toList()

fun main() {
  println(range4(5))
  println(range4(3))
  println(range4(1))
  println(range4(8))
  println(range4(0))
  println(range4(6))
}
