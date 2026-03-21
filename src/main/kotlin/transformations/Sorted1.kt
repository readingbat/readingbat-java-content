package transformations

// @desc **sortedBy** reorders elements based on the value the lambda returns for each one.

fun sorted1(list: List<String>): List<String> = list.sortedBy { it.length }

fun main() {
  println(sorted1(listOf("cat", "a", "hello", "bb")))
  println(sorted1(listOf("dog", "hi", "elephant")))
  println(sorted1(listOf("x", "abc", "ab")))
  println(sorted1(listOf("one", "two", "three", "four")))
  println(sorted1(listOf("zz", "a", "bbb", "cccc")))
  println(sorted1(listOf("long", "short", "tiny")))
}
