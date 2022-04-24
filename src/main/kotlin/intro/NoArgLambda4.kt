package intro

// Higher-order function as a return type
fun funcGen1(i: Int): () -> Int {
  return { i }
}

fun funcNoArg4a(i: Int, j: Int): Int = i * funcGen1(j).invoke()

fun funcNoArg4b(i: Int, j: Int): Int = i * funcGen1(j)()

fun main() {
  println(funcNoArg4a(5, 10))
  println(funcNoArg4a(10, 15))
  println(funcNoArg4b(6, 12))
  println(funcNoArg4b(20, 25))
}