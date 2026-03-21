package scope_funcs

// @desc **let** passes the object as **it** to the lambda and returns the lambda's result.

fun let1(s: String): String = s.let { it.uppercase() + it.lowercase() }

fun main() {
  println(let1("abc"))
  println(let1("Hello"))
  println(let1("Kotlin"))
  println(let1("x"))
  println(let1("FUN"))
  println(let1("Test"))
}
