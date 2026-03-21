package transformations

// @desc **associateWith** creates a map using each element as the key and the lambda result as the value.

fun associate1(list: List<String>): String = list.associateWith { it.length }.toString()

fun main() {
  println(associate1(listOf("cat", "dog", "hi")))
  println(associate1(listOf("a", "bb", "ccc")))
  println(associate1(listOf("hello", "world")))
  println(associate1(listOf("x")))
  println(associate1(listOf("one", "two", "three")))
  println(associate1(listOf("ab", "cd")))
}
