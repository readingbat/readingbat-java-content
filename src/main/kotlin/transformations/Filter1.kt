package transformations

val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

val isOdd: (Int) -> Boolean = { it % 2 == 1 }

fun filterIt1a(i: Int, func: (Int) -> Boolean): List<Int> {
  val list = mutableListOf<Int>()
  for (v in (0..i).toList()) {   // (0..i) is inclusive
    if (func.invoke(v))
      list.add(v)
  }
  return list
}

fun filterIt1b(i: Int, func: (Int) -> Boolean): List<Int> {
  return (0..i).toList().filter(func)
}

fun main() {
  println(filterIt1a(8, isEven))
  println(filterIt1a(8, isOdd))
  println(filterIt1b(6, isEven))
  println(filterIt1b(6, isOdd))
  println(filterIt1b(4, { i: Int -> i % 2 == 0 }))
  println(filterIt1b(4, { i: Int -> i % 2 != 0 }))
  println(filterIt1b(4, { it % 2 == 0 }))
  println(filterIt1b(4, { it % 2 != 0 }))
}