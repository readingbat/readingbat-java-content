package transformations

val isInRange1: (Int) -> Boolean = { i: Int -> i >= 3 && i <= 6 }

val isInRange2: (Int) -> Boolean = { it < 2 || it > 5 }

fun mapIt2Long(i: Int, func: (Int) -> Boolean): List<Boolean> {
  val list = mutableListOf<Boolean>()
  for (v in (0..i).toList()) {   // (0..i) is inclusive
    val w = func.invoke(v)
    list.add(w)
  }
  return list
}

fun mapIt2Short(i: Int, func: (Int) -> Boolean): List<Boolean> = (0..i).toList().map(func)

fun main() {
  println(mapIt2Long(4, isInRange1))
  println(mapIt2Long(4, isInRange2))
  println(mapIt2Short(2, isInRange1))
  println(mapIt2Short(2, isInRange2))
  println(mapIt2Short(4, { i: Int -> i > 4 }))
  println(mapIt2Short(4, { i: Int -> i < 5 }))
  println(mapIt2Short(4, { it == 5 }))
  println(mapIt2Short(4, { it == 4 }))
}