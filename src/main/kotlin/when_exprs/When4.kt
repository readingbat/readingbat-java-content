package when_exprs

// @desc Multiple values can share a branch — separate them with commas.

fun groupNumber(n: Int): String =
  when (n) {
    1, 2, 3 -> "low"
    4, 5, 6 -> "mid"
    7, 8, 9 -> "high"
    else -> "out of range"
  }

fun main() {
  println(groupNumber(1))
  println(groupNumber(3))
  println(groupNumber(4))
  println(groupNumber(6))
  println(groupNumber(7))
  println(groupNumber(9))
  println(groupNumber(0))
  println(groupNumber(10))
}
