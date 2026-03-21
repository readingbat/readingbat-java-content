package null_safety

// @desc **?.let** only runs the block when the value is not null — inside, **it** is guaranteed non-null.

fun doubleLength(s: String?): Int = s?.let { it.length * 2 } ?: -1

fun main() {
  println(doubleLength("hello"))
  println(doubleLength(null))
  println(doubleLength("abc"))
  println(doubleLength(""))
  println(doubleLength("ab"))
  println(doubleLength("Kotlin"))
}
