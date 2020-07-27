package intro

val tripleIt: (Int) -> Int = { i: Int -> i * 3 }

val quadItIt: (Int) -> Int = { i: Int -> i * 4 }

fun func3(i: Int, func: (Int) -> Int): Int {
  return func.invoke(i)
}

fun main() {
  println(func3(5, tripleIt))
  println(func3(10, quadItIt))
  println(func3(20, tripleIt))
  println(func3(40, quadItIt))
}