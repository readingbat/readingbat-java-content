package fold_reduce

// @desc **reduce** is like **fold** but uses the first element as the starting accumulator — no initial value needed.

fun reduce1(list: List<Int>): Int = list.reduce { acc, i -> acc + i }

fun main() {
  println(reduce1(listOf(1, 2, 3)))
  println(reduce1(listOf(10, 20, 30)))
  println(reduce1(listOf(5)))
  println(reduce1(listOf(1, 1, 1, 1)))
  println(reduce1(listOf(100, 200)))
  println(reduce1(listOf(4, 3, 2, 1)))
}
