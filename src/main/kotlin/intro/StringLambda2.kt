package intro

val upperIt: (String) -> String = { s: String -> s.uppercase() + s.uppercase() }

fun func2(s: String): String {
  return upperIt.invoke(s)
}

fun main() {
  println(func2("abc"))
  println(func2("table"))
  println(func2("house"))
}