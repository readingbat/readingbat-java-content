package null_safety

// @desc **filterNotNull()** removes all **null** entries from a list.

fun keepNonNull(items: List<String?>): List<String> = items.filterNotNull()

fun main() {
  println(keepNonNull(listOf("a", null, "b")))
  println(keepNonNull(listOf(null, null, null)))
  println(keepNonNull(listOf("hello")))
  println(keepNonNull(listOf(null, "x")))
  println(keepNonNull(listOf("a", "b", "c")))
  println(keepNonNull(listOf()))
}
