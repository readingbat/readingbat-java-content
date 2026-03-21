package scope_funcs

// @desc **takeIf** returns the value if the condition is true, or **null** if false — then **?.let** handles both cases.

fun let3(s: String): String = s.takeIf { it.length > 3 }?.let { it.uppercase() } ?: "too short"

fun main() {
  println(let3("abc"))
  println(let3("Hello"))
  println(let3("x"))
  println(let3("Kotlin"))
  println(let3("abcd"))
  println(let3("no"))
  println(let3("scope"))
}
