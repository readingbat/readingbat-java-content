package zip_partition

// @desc **zip** pairs up elements from two lists by position — extra elements are dropped.

fun zip1(a: List<Int>, b: List<Int>): String = a.zip(b).toString()

fun main() {
  println(zip1(listOf(1, 2, 3), listOf(4, 5, 6)))
  println(zip1(listOf(1, 2), listOf(3, 4, 5)))
  println(zip1(listOf(10, 20, 30), listOf(1, 2)))
  println(zip1(listOf(1), listOf(2)))
  println(zip1(emptyList(), listOf(1, 2)))
  println(zip1(listOf(5, 6, 7), listOf(8, 9, 10)))
}
