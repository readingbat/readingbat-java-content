package zip_partition

// @desc **partition** splits a list into two — elements that pass the test and elements that don't.

fun partition1(list: List<Int>): String = list.partition { it > 0 }.toString()

fun main() {
  println(partition1(listOf(1, -2, 3, -4, 5)))
  println(partition1(listOf(-1, -2, -3)))
  println(partition1(listOf(1, 2, 3)))
  println(partition1(listOf(0, 1, -1)))
  println(partition1(listOf(10, -5, 20, -15)))
  println(partition1(emptyList()))
}
