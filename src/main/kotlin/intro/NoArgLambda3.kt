package intro

val constVal1: () -> Int = { 4 }

val constVal2: () -> Int = { 6 }

fun constFunc(): Int {
  return 8
}

val constVal3: () -> Int = ::constFunc

// Higher-order function as a parameter
fun funcNoArg3(i: Int, func: () -> Int): Int {
  return i * func.invoke()
}

fun main() {
  println(funcNoArg3(5, constVal1))
  println(funcNoArg3(10, constVal2))
  println(funcNoArg3(6, ::constFunc))
  println(funcNoArg3(20, constVal3))
}