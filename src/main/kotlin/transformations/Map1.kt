package transformations

val doubleIt: (Int) -> Int = { i: Int -> i * 2 }

val tripleIt: (Int) -> Int = { it * 3 }

fun mapIt1Long(i: Int, func: (Int) -> Int): List<Int> {
  val list = mutableListOf<Int>()
  for (v in (0..i).toList()) {   // (0..i) is inclusive
    val w = func.invoke(v)
    list.add(w)
  }
  return list
}

fun mapIt1Short(i: Int, func: (Int) -> Int): List<Int> {
  return (0..i).toList().map(func)
}

fun main() {
  println(mapIt1Long(6, doubleIt))
  println(mapIt1Long(6, tripleIt))
  println(mapIt1Short(6, doubleIt))
  println(mapIt1Short(6, tripleIt))
  println(mapIt1Short(4, { i: Int -> i * 4 }))
  println(mapIt1Short(4, { i: Int -> i * 5 }))
  println(mapIt1Short(4, { it * 7 }))
  println(mapIt1Short(4, { it * 8 }))
}