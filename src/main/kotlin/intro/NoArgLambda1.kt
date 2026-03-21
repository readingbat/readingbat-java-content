package intro
// @desc Follow the chain of function calls — what value does each function return to its caller?

fun constVal(): Int {
  return 5
}

fun funcNoArg1(i: Int): Int = i * constVal()

fun main() {
  println(funcNoArg1(5))
  println(funcNoArg1(10))
  println(funcNoArg1(20))
}