package intro

fun constVal(): Int {
  return 5
}

fun funcNoArg1(i: Int): Int {
  return i * constVal()
}

fun main() {
  println(funcNoArg1(5))
  println(funcNoArg1(10))
  println(funcNoArg1(20))
}