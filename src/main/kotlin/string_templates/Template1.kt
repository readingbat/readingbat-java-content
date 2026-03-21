package string_templates

// @desc **$variable** inside a string is replaced with the variable's value.

fun greet(name: String): String = "Hello, $name!"

fun main() {
  println(greet("Alice"))
  println(greet("Bob"))
  println(greet(""))
  println(greet("World"))
  println(greet("Kotlin"))
  println(greet(" "))
}
