package intro

val evens = { i: Int -> i % 2 == 0 }

val odds = { i: Int -> i % 2 == 1 }

fun addUp1(i: Int, func: (Int) -> Boolean): List<Int> {
  val list = mutableListOf<Int>()
  for (v in (0..i).toList()) {   // (0..i) is inclusive
    if (func.invoke(v))
      list.add(v)
  }
  return list
}

fun addUp2(i: Int, func: (Int) -> Boolean): List<Int> {
  return (0..i).toList().filter(func)
}

fun addUp3(i: Int, func: (Int) -> Boolean): List<Int> = (0..i).toList().filter(func)

fun main() {
  println(addUp1(8, evens))
  println(addUp1(8, odds))
  println(addUp2(6, evens))
  println(addUp2(6, odds))
  println(addUp3(4, evens))
  println(addUp3(4, odds))
}