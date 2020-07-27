package intro

val tripleIt3: (Int) -> Int = { i: Int -> i * 3 }

// Simplify things with it
val quadItIt3: (Int) -> Int = { it * 4 }

fun doubleIt3(i: Int): Int {
  return i * 2
}

val doubleIt3: (Int) -> Int = ::doubleIt3

// Higher-order function as a parameter
fun func3(i: Int, func: (Int) -> Int): Int {
  return func.invoke(i)
}

fun main() {
  println(func3(5, tripleIt3))
  println(func3(10, quadItIt3))
  println(func3(20, tripleIt3))
  println(func3(30, ::doubleIt3))
  println(func3(40, doubleIt3))
}