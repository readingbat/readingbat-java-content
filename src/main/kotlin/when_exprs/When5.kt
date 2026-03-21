package when_exprs

// @desc **when** can be used as an expression that returns a value — every branch must produce one.

fun dayType(day: Int): Int =
  when (day) {
    1, 7 -> 0
    2, 3, 4, 5, 6 -> 1
    else -> -1
  }

fun main() {
  println(dayType(1))
  println(dayType(2))
  println(dayType(5))
  println(dayType(6))
  println(dayType(7))
  println(dayType(0))
  println(dayType(8))
}
