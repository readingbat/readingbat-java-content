package intro

fun upperIt(s: String): String {
  return s.toUpperCase() + s.toUpperCase()
}

fun func1(s: String): String {
  return upperIt(s)
}

fun main() {
  println(func1("abc"))
  println(func1("table"))
  println(func1("house"))
}