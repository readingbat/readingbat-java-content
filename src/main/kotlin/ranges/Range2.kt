package ranges

// @desc **downTo** counts backward — the range goes from the larger number down to the smaller.

fun range2(n: Int): List<Int> = (n downTo 1).toList()

fun main() {
  println(range2(5))
  println(range2(3))
  println(range2(1))
  println(range2(8))
  println(range2(6))
  println(range2(10))
}
