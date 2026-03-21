package scope_funcs

// @desc Inside **run**, you can call methods directly on the receiver without **it** — the object becomes **this**.

fun run1(s: String): String = s.run { uppercase() + " " + lowercase() }

fun main() {
  println(run1("abc"))
  println(run1("Hello"))
  println(run1("Kotlin"))
  println(run1("x"))
  println(run1("FUN"))
  println(run1("Test"))
}
