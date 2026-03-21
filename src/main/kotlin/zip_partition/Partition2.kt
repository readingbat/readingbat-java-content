package zip_partition

// @desc The first list contains matches, the second contains non-matches — check each element against the condition.

fun partition2(list: List<String>): String = list.partition { it.length > 3 }.toString()

fun main() {
  println(partition2(listOf("hello", "hi", "world", "ok")))
  println(partition2(listOf("a", "bb", "ccc")))
  println(partition2(listOf("long", "word", "short")))
  println(partition2(listOf("one", "two", "three", "four")))
  println(partition2(emptyList()))
  println(partition2(listOf("abcd", "efgh")))
}
