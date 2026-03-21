package intro

// @desc A lambda assigned to a variable works like a regular function — trace what **.invoke()** does.

val upperIt: (String) -> String = { s: String -> s.uppercase() + s.uppercase() }

fun func2(s: String): String = upperIt.invoke(s)

fun main() {
  println(func2("abc"))
  println(func2("table"))
  println(func2("house"))
}