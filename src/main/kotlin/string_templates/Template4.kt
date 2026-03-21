package string_templates

// @desc Any Kotlin expression works inside **${}** — including function calls and method chains.

fun showUpper(s: String): String = "Upper: ${s.uppercase()}"

fun main() {
  println(showUpper("hello"))
  println(showUpper("abc"))
  println(showUpper(""))
  println(showUpper("Kotlin"))
  println(showUpper("ABC"))
  println(showUpper("hi there"))
}
