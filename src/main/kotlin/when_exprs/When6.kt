package when_exprs

// @desc **is** checks the type of a value — Kotlin smart-casts it inside the branch.

fun describeType(value: Any): String =
  when (value) {
    is String -> "String of length ${value.length}"
    is Int -> "Int: $value"
    is Boolean -> "Boolean: $value"
    is List<*> -> "List of size ${value.size}"
    else -> "Unknown"
  }

fun main() {
  println(describeType("hello"))
  println(describeType(""))
  println(describeType(42))
  println(describeType(0))
  println(describeType(true))
  println(describeType(false))
  println(describeType(listOf(1, 2, 3)))
  println(describeType(listOf<Int>()))
}
