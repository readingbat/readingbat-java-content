package ranges

// @desc **filter** on a range keeps only elements that pass the test.

fun range5(n: Int): List<Int> = (1..n).filter { it % 2 == 0 }

fun main() {
  println(range5(10))
  println(range5(7))
  println(range5(5))
  println(range5(1))
  println(range5(12))
  println(range5(3))
}
