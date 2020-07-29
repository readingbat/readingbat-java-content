package intro

val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

val isOdd: (Int) -> Boolean = { i: Int -> i % 2 == 1 }

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

fun main() {
  println(addUp1(8, isEven))
  println(addUp1(8, isOdd))
  println(addUp2(6, isEven))
  println(addUp2(6, isOdd))
  println(addUp2(4, { i: Int -> i % 2 == 0 }))
  println(addUp2(4, { i: Int -> i % 2 != 0 }))
  println(addUp2(4, { it % 2 == 0 }))
  println(addUp2(4, { it % 2 != 0 }))
}