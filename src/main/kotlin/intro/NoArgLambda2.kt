package intro

val constVal: () -> Int = { 4 }

fun funcNoArg2(i: Int): Int {
  return i * constVal.invoke()
}

fun main() {
  println(funcNoArg2(5))
  println(funcNoArg2(10))
  println(funcNoArg2(20))
}