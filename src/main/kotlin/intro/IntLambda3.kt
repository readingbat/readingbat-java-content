package intro

val tripleIt3: (Int) -> Int = { i: Int -> i * 3 }

val quadItIt3: (Int) -> Int = { i: Int -> i * 4 }

fun doubleIt3(i: Int): Int {
  return i * 2
}

fun func3(i: Int, func: (Int) -> Int): Int {
  return func.invoke(i)
}

fun main() {
  println(func3(5, tripleIt3))
  println(func3(10, quadItIt3))
  println(func3(20, tripleIt3))
  println(func3(40, ::doubleIt3))
}