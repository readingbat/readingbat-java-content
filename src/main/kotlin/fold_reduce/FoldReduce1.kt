package fold_reduce

// @desc **foldIndexed** gives you the index too — trace both the index and accumulator at each step.

fun foldReduce1(list: List<Int>): Int = list.foldIndexed(0) { index, acc, i -> acc + i * index }

fun main() {
  println(foldReduce1(listOf(1, 2, 3)))
  println(foldReduce1(listOf(10, 20, 30)))
  println(foldReduce1(listOf(5)))
  println(foldReduce1(listOf(1, 1, 1, 1)))
  println(foldReduce1(listOf(3, 2, 1)))
  println(foldReduce1(listOf(4, 5, 6, 7)))
}
