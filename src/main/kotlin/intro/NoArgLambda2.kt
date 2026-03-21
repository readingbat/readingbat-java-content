package intro

// @desc A lambda assigned to a variable can be called with **.invoke()** or directly with parentheses.

val constVal: () -> Int = { 4 }

fun funcNoArg2(i: Int): Int = i * constVal.invoke()

fun main() {
  println(funcNoArg2(5))
  println(funcNoArg2(10))
  println(funcNoArg2(20))
}