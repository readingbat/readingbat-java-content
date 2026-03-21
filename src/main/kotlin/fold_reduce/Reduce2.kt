package fold_reduce

// @desc **reduce** combines elements left to right — the accumulator grows with each step.

fun reduce2(list: List<String>): String = list.reduce { acc, s -> "$acc, $s" }

fun main() {
  println(reduce2(listOf("a", "b", "c")))
  println(reduce2(listOf("hello", "world")))
  println(reduce2(listOf("x")))
  println(reduce2(listOf("one", "two", "three")))
  println(reduce2(listOf("red", "green", "blue", "yellow")))
  println(reduce2(listOf("ab", "cd")))
}
