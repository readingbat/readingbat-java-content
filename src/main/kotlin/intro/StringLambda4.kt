package intro

// @desc A lambda can contain multiple statements — the last expression is the return value.

val multiStmt: (String) -> String = { s ->
  val upper = s.uppercase()
  upper + upper.reversed()
}

fun applyIt(s: String, func: (String) -> String): String = func(s)

fun main() {
  println(applyIt("abc", multiStmt))
  println(applyIt("Hello", multiStmt))
  println(applyIt("xy", multiStmt))
  println(applyIt("Kotlin", multiStmt))
  println(applyIt("a", multiStmt))
  println(applyIt("Fun", multiStmt))
}
