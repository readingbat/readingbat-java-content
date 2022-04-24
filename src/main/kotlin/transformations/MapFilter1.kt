package transformations

fun filterMap2Long(mapFunc: (Int) -> Int, filterFunc: (Int) -> Boolean): List<Int> {
  val list = mutableListOf<Int>()
  for (v in listOf(0, 1, 2, 3, 4)) {
    val w = mapFunc.invoke(v)
    if (filterFunc(w))
      list.add(w)
  }
  return list
}

fun filterMap2Short(mapFunc: (Int) -> Int, filterFunc: (Int) -> Boolean): List<Int> =
  listOf(0, 1, 2, 3, 4)
    .map(mapFunc)
    .filter(filterFunc)

fun main() {
  println(filterMap2Long({ it * 2 }, { it > 3 }))
  println(filterMap2Long({ it * 3 }, { it < 7 }))
  println(filterMap2Short({ (it * 10).toString().length }, { it == 1 }))
  println(filterMap2Short({ it }, { it >= 3 }))
  println(filterMap2Short({ it + 2 }, { it < 5 }))
  println(filterMap2Short({ it - 1 }, { it == 3 }))
}