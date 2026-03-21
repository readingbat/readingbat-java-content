package zip_partition

// @desc The zip transform can produce any type — here it builds a formatted string from each pair.

fun zip3(a: List<String>, b: List<Int>): List<String> = a.zip(b) { x, y -> "$x=$y" }

fun main() {
  println(zip3(listOf("a", "b", "c"), listOf(1, 2, 3)))
  println(zip3(listOf("x", "y"), listOf(10, 20, 30)))
  println(zip3(listOf("red", "green", "blue"), listOf(1, 2)))
  println(zip3(listOf("cat"), listOf(5)))
  println(zip3(listOf("one", "two", "three"), listOf(1, 2, 3)))
  println(zip3(emptyList(), listOf(1, 2)))
}
