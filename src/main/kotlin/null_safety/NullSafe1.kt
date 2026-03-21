package null_safety

// @desc The **?.** operator returns **null** if the receiver is null — otherwise it calls the method normally.

fun safeLength(s: String?): Int = s?.length ?: -1

fun main() {
  println(safeLength("hello"))
  println(safeLength(""))
  println(safeLength(null))
  println(safeLength("abc"))
  println(safeLength("Kotlin"))
  println(safeLength(" "))
}
