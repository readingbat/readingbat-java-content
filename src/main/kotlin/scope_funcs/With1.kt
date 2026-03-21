package scope_funcs

// @desc **with** lets you call multiple methods on the same object without repeating its name.

fun with1(s: String): String = with(s) { "${length}: ${uppercase()}" }

fun main() {
  println(with1("abc"))
  println(with1("Hello"))
  println(with1("Kotlin"))
  println(with1("x"))
  println(with1("FUN"))
  println(with1("Test"))
}
