package null_safety

// @desc The **?:** (elvis) operator provides a default value when the left side is **null**.

fun safeUpper(s: String?): String = s?.uppercase() ?: "EMPTY"

fun main() {
  println(safeUpper("hello"))
  println(safeUpper(null))
  println(safeUpper("abc"))
  println(safeUpper(""))
  println(safeUpper("Kotlin"))
  println(safeUpper(" hi "))
}
