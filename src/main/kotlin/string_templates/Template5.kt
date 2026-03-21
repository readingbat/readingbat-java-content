package string_templates

// @desc Even **if** expressions can go inside **${}** — Kotlin's **if** returns a value.

fun describeSign(n: Int): String = "${if (n > 0) "positive" else "non-positive"}"

fun main() {
  println(describeSign(5))
  println(describeSign(0))
  println(describeSign(-3))
  println(describeSign(1))
  println(describeSign(-100))
  println(describeSign(42))
}
