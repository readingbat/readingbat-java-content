package intro

val upperIt2: (String) -> String = { s: String -> s.toUpperCase() + s.toUpperCase() }

// Simplify things with it
val upperIt3: (String) -> String = { it.toUpperCase() + it.toUpperCase() + it.toUpperCase() }

fun upperIt3(s: String): String {
  return s.toUpperCase() + s.toUpperCase()
}

// Higher-order function as a parameter
fun func3(s: String, func: (String) -> String): String {
  return func.invoke(s)
}

fun main() {
  println(func3("abc", upperIt2))
  println(func3("table", upperIt3))
  println(func3("house", ::upperIt3))
}