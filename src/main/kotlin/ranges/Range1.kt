package ranges

// @desc **1..n** creates a range from 1 to n *inclusive* — both endpoints are included.

fun range1(n: Int): List<Int> = (1..n).toList()

fun main() {
  println(range1(5))
  println(range1(3))
  println(range1(1))
  println(range1(8))
  println(range1(10))
  println(range1(0))
}
