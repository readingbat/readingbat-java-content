package string_templates

// @desc You can mix **$var** and **${expr}** in the same string — each is evaluated independently.

fun showSum(a: Int, b: Int): String = "$a + $b = ${a + b}"

fun main() {
  println(showSum(1, 2))
  println(showSum(0, 0))
  println(showSum(-1, 1))
  println(showSum(10, 20))
  println(showSum(5, -3))
  println(showSum(100, 200))
}
