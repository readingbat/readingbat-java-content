package intro

// @desc When the last parameter is a lambda, it can be placed outside the parentheses.

fun applyFunc(i: Int, func: (Int) -> Int): Int = func(i)

fun main() {
  println(applyFunc(10) { it * 5 })
  println(applyFunc(3) { it * 3 })
  println(applyFunc(7) { it + 10 })
  println(applyFunc(4) { it * it })
  println(applyFunc(0) { it * 5 })
  println(applyFunc(2) { it + it + it })
}
