package intro

val doubleIt2: (Int) -> Int = { i: Int -> i * 2 }

fun func2a(i: Int): Int = doubleIt2.invoke(i)

fun func2b(i: Int): Int = doubleIt2(i)

fun main() {
  println(func2a(5))
  println(func2a(10))
  println(func2b(20))
  println(func2b(25))
}