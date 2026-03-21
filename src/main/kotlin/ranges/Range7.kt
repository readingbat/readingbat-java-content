package ranges

// @desc **map** transforms each element in the range — trace what the lambda does to each value.

fun range7(n: Int): List<Int> = (1..n).map { it * it }

fun main() {
  println(range7(5))
  println(range7(3))
  println(range7(1))
  println(range7(6))
  println(range7(8))
  println(range7(4))
}
