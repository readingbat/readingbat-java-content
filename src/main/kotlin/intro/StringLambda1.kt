package intro

fun upperIt1(s: String): String = s.uppercase() + s.uppercase()

fun func1(s: String): String = upperIt1(s)

fun main() {
  println(func1("abc"))
  println(func1("table"))
  println(func1("house"))
}