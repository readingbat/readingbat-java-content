package null_safety

// @desc **listOfNotNull()** creates a list with all **null** values removed.

fun nonNullInts(a: Int?, b: Int?, c: Int?): List<Int> = listOfNotNull(a, b, c)

fun main() {
  println(nonNullInts(1, 2, 3))
  println(nonNullInts(null, 2, 3))
  println(nonNullInts(1, null, 3))
  println(nonNullInts(1, 2, null))
  println(nonNullInts(null, null, null))
  println(nonNullInts(null, null, 5))
}
