package intro

val tripleIt4: (Int) -> Int = { i: Int -> i * 3 }

val quadItIt4: (Int) -> Int = { i: Int -> i * 4 }

fun doubleIt4(i: Int): Int {
  return i * 2
}

fun func4(i: Int, funcs: List<(Int) -> Int>): List<Int> {
  val list = mutableListOf<Int>()
  for (func in funcs)
    list.add(func.invoke((i)))
  return list
}

fun main() {
  println(func4(4, listOf(tripleIt4)))
  println(func4(5, listOf(tripleIt4, tripleIt4)))
  println(func4(10, listOf(quadItIt4, tripleIt4, tripleIt4)))
  println(func4(20, listOf(::doubleIt4, tripleIt4, ::doubleIt4)))
}