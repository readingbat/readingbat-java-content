package fold_reduce

// @desc The lambda can transform each element before combining — here it extracts the length.

fun fold4(list: List<String>): Int = list.fold(0) { acc, s -> acc + s.length }

fun main() {
  println(fold4(listOf("a", "bb", "ccc")))
  println(fold4(listOf("hello", "world")))
  println(fold4(listOf("x")))
  println(fold4(listOf("one", "two", "three")))
  println(fold4(emptyList()))
  println(fold4(listOf("ab", "cd", "ef")))
}
