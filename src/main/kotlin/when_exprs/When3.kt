package when_exprs

// @desc **when** without an argument evaluates each condition top to bottom — the first **true** wins.

fun classify(n: Int): String =
  when {
    n < 0 -> "negative"
    n == 0 -> "zero"
    n < 10 -> "small"
    n < 100 -> "medium"
    else -> "large"
  }

fun main() {
  println(classify(-5))
  println(classify(0))
  println(classify(1))
  println(classify(9))
  println(classify(10))
  println(classify(99))
  println(classify(100))
}
