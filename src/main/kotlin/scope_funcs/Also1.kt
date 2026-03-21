package scope_funcs

// @desc **also** returns the *original* object unchanged — the lambda's return value is ignored.

fun also1(s: String): String = s.uppercase().also { it.lowercase() }

fun main() {
  println(also1("abc"))
  println(also1("Hello"))
  println(also1("Kotlin"))
  println(also1("x"))
  println(also1("FUN"))
  println(also1("Test"))
}
