package zip_partition

// @desc **zip** with a transform combines each pair — trace what the lambda does to matching elements.

fun zip2(a: List<Int>, b: List<Int>): List<Int> = a.zip(b) { x, y -> x + y }

fun main() {
  println(zip2(listOf(1, 2, 3), listOf(4, 5, 6)))
  println(zip2(listOf(10, 20), listOf(1, 2)))
  println(zip2(listOf(1, 2, 3), listOf(10, 20)))
  println(zip2(listOf(0, 0, 0), listOf(1, 2, 3)))
  println(zip2(listOf(5), listOf(10)))
  println(zip2(listOf(100, 200), listOf(300, 400)))
}
