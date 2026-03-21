package fold_reduce

// @desc **fold** with a string accumulator builds the result by appending each element.

fun fold2(list: List<String>): String = list.fold("") { acc, s -> acc + s }

fun main() {
  println(fold2(listOf("a", "b", "c")))
  println(fold2(listOf("hello", " ", "world")))
  println(fold2(listOf("x")))
  println(fold2(listOf("one", "two", "three")))
  println(fold2(emptyList()))
  println(fold2(listOf("ab", "cd", "ef")))
}
