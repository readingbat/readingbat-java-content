package transformations

// @desc **distinct** removes duplicates — **distinctBy** removes duplicates based on a computed key.

fun distinct1(list: List<String>): String = list.distinctBy { it.length }.joinToString(", ")

fun main() {
  println(distinct1(listOf("cat", "dog", "hi", "elephant")))
  println(distinct1(listOf("a", "bb", "c", "dd", "eee")))
  println(distinct1(listOf("hello", "world")))
  println(distinct1(listOf("x", "y", "z")))
  println(distinct1(listOf("one", "two", "three", "four")))
  println(distinct1(listOf("ab", "cd", "efg", "hi")))
}
