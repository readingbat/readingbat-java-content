package transformations

val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

val isOdd: (Int) -> Boolean = { it % 2 == 1 }

fun filterIt1Long(i: Int, func: (Int) -> Boolean): List<Int> =
  buildList {
    for (v in (0..i).toList()) {   // (0..i) is inclusive
      if (func.invoke(v))
        add(v)
    }
  }

fun filterIt1Short(i: Int, func: (Int) -> Boolean): List<Int> = (0..i).toList().filter(func)

fun main() {
  println(filterIt1Long(8, isEven))
  println(filterIt1Long(8, isOdd))
  println(filterIt1Short(6, isEven))
  println(filterIt1Short(6, isOdd))
  println(filterIt1Short(4, { i: Int -> i % 2 == 0 }))
  println(filterIt1Short(4, { i: Int -> i % 2 != 0 }))
  println(filterIt1Short(4, { it % 2 == 0 }))
  println(filterIt1Short(4, { it % 2 != 0 }))
}