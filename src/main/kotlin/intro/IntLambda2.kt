package intro

val doubleIt: (Int) -> Int = { i: Int -> i * 2 }

fun func2(i: Int): Int {
  return doubleIt.invoke(i)
}

fun main() {
  println(func2(5))
  println(func2(10))
  println(func2(20))
}