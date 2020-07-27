package lambda1

fun doubleIt(i: Int): Int {
  return i * 2
}

fun func1(i: Int): Int {
  return doubleIt(i)
}

fun main() {
  println(func1(5))
  println(func1(10))
  println(func1(20))
}