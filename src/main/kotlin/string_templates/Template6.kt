package string_templates

// @desc **joinToString()** converts a list to a comma-separated string inside the template.

fun showItems(list: List<String>): String = "Items: ${list.joinToString()}"

fun main() {
  println(showItems(listOf("a", "b", "c")))
  println(showItems(listOf("hello")))
  println(showItems(listOf()))
  println(showItems(listOf("x", "y")))
  println(showItems(listOf("one", "two", "three", "four")))
  println(showItems(listOf("")))
}
