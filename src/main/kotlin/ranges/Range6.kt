package ranges

// @desc Kotlin supports character ranges — **'a'..'z'** covers all lowercase letters.

fun range6(word: String): String = ('a'..'z').filter { it in word }.joinToString("")

fun main() {
  println(range6("hello"))
  println(range6("world"))
  println(range6("abcxyz"))
  println(range6("banana"))
  println(range6("kotlin"))
  println(range6("zzz"))
}
