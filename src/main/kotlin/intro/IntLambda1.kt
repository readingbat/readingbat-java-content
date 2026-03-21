package intro
// @desc Follow the function calls step by step — what goes in, and what comes out?

fun doubleIt1(i: Int): Int = i * 2

fun func1(i: Int): Int = doubleIt1(i)

fun main() {
  println(func1(5))
  println(func1(10))
  println(func1(20))
}