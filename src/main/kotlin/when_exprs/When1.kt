package when_exprs

// @desc **when** matches the value against each branch — only the first match executes.

fun numberName(n: Int): String =
  when (n) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    else -> "other"
  }

fun main() {
  println(numberName(1))
  println(numberName(2))
  println(numberName(3))
  println(numberName(4))
  println(numberName(0))
  println(numberName(-1))
  println(numberName(100))
}
