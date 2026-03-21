package string_templates

// @desc **${expression}** evaluates the expression and inserts the result into the string.

fun showLength(s: String): String = "Length: ${s.length}"

fun main() {
  println(showLength("hello"))
  println(showLength(""))
  println(showLength("abc"))
  println(showLength("Kotlin"))
  println(showLength(" "))
  println(showLength("ab"))
}
