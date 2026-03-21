package fold_reduce

// @desc **fold** starts with an initial value and combines each element — trace the accumulator at each step.

fun fold1(list: List<Int>): Int = list.fold(0) { acc, i -> acc + i }

fun main() {
  println(fold1(listOf(1, 2, 3)))
  println(fold1(listOf(10, 20, 30)))
  println(fold1(listOf(5)))
  println(fold1(listOf(1, 1, 1, 1)))
  println(fold1(listOf(100, 200)))
  println(fold1(emptyList()))
}
