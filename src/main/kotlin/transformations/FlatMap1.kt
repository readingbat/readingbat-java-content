package transformations

// @desc **flatMap** transforms each element into a list, then flattens all results into one list.

fun flatMap1(list: List<String>): String = list.flatMap { it.toList() }.joinToString(", ")

fun main() {
  println(flatMap1(listOf("ab", "cd")))
  println(flatMap1(listOf("hello")))
  println(flatMap1(listOf("a", "b", "c")))
  println(flatMap1(listOf("xy", "z")))
  println(flatMap1(listOf("abc", "de", "f")))
  println(flatMap1(listOf()))
}
