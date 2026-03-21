package fold_reduce

// @desc Watch the initial value — **fold** starts multiplying from there.

fun fold3(list: List<Int>): Int = list.fold(1) { acc, i -> acc * i }

fun main() {
  println(fold3(listOf(1, 2, 3)))
  println(fold3(listOf(2, 3, 4)))
  println(fold3(listOf(5)))
  println(fold3(listOf(1, 1, 1, 1)))
  println(fold3(listOf(10, 10)))
  println(fold3(listOf(2, 2, 2)))
}
