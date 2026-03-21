package ranges

// @desc **step** skips values — only every Nth value in the range is included.

fun range3(n: Int): List<Int> = (1..n step 2).toList()

fun main() {
  println(range3(10))
  println(range3(7))
  println(range3(5))
  println(range3(1))
  println(range3(12))
  println(range3(9))
}
