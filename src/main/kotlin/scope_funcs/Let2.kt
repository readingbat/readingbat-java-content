package scope_funcs

// @desc Each **let** in the chain transforms the result — trace what **it** equals at each step.

fun let2(s: String): Int = s.let { it.length }.let { it * 2 }

fun main() {
  println(let2("abc"))
  println(let2("Hello"))
  println(let2("x"))
  println(let2("Kotlin"))
  println(let2("ab"))
  println(let2("scope"))
}
