package intro

val tripleIt4: (Int) -> Int = { i: Int -> i * 3 }

val quadIt4: (Int) -> Int = { i: Int -> i * 4 }

fun doubleIt4(i: Int): Int = i * 2

fun func4(i: Int, funcs: List<(Int) -> Int>): List<Int> =
  buildList {
    funcs.forEach { func: (Int) -> Int ->
      add(func((i)))
    }
  }

fun main() {
  println(func4(4, listOf(tripleIt4)))
  println(func4(5, listOf(tripleIt4, tripleIt4)))
  println(func4(10, listOf(quadIt4, tripleIt4, tripleIt4)))
  println(func4(20, listOf(::doubleIt4, tripleIt4, ::doubleIt4)))
  println(func4(20, listOf({ i: Int -> i * 3 }, { i: Int -> i * 2 })))
  println(func4(20, listOf({ i: Int -> i * 3 }, { it * 4 })))
}