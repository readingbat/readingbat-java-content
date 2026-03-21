package transformations

// @desc **groupBy** collects elements into a map — each key maps to a list of matching elements.

fun groupBy1(list: List<String>): String = list.groupBy { it.length }.toString()

fun main() {
  println(groupBy1(listOf("a", "bb", "c", "dd")))
  println(groupBy1(listOf("cat", "dog", "hi")))
  println(groupBy1(listOf("one", "two", "three", "four")))
  println(groupBy1(listOf("x")))
  println(groupBy1(listOf("ab", "cd", "ef")))
  println(groupBy1(listOf("hello", "world", "hi", "go")))
}
