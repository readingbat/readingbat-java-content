package intro

// Higher-order function as a return type
fun funcGena(i: Int): (Int) -> Int = { j: Int -> j * i }

// Higher-order function as a return type
fun funcGenb(i: Int): (Int) -> Int = { it * i }

fun funcWithInvoke(i: Int, j: Int): Int = funcGena(i).invoke(j)

fun funcNoInvoke(i: Int, j: Int): Int = funcGenb(i)(j)

fun main() {
  println(funcWithInvoke(5, 6))
  println(funcWithInvoke(10, 2))
  println(funcNoInvoke(20, 5))
  println(funcNoInvoke(30, 3))
  println(funcNoInvoke(40, 4))
}