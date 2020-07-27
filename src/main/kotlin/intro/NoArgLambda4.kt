package intro

// Higher-order function as a return type
fun funcGen1(i: Int): () -> Int {
  return { i }
}

fun funcNoArg4(i: Int, j: Int): Int {
  return i * funcGen1(j).invoke()
}

fun main() {
  println(funcNoArg4(5, 10))
  println(funcNoArg4(10, 15))
  println(funcNoArg4(6, 12))
  println(funcNoArg4(20, 25))
}