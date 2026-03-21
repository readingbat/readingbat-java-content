package zip_partition

// @desc **unzip** is the reverse of zip — it splits a list of pairs into two separate lists.

fun unzip1(list: List<Pair<Int, String>>): String = list.unzip().toString()

fun main() {
  println(unzip1(listOf(1 to "a", 2 to "b", 3 to "c")))
  println(unzip1(listOf(10 to "x", 20 to "y")))
  println(unzip1(listOf(5 to "hello")))
  println(unzip1(emptyList()))
  println(unzip1(listOf(1 to "one", 2 to "two", 3 to "three")))
  println(unzip1(listOf(100 to "a", 200 to "b")))
}
