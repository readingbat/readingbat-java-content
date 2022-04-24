package transformations

fun chain2(s: String): String =
  s.asSequence()
    .map { it.uppercase() + it.lowercase() }
    .filter { "a" in it }
    .joinToString("-")

fun main() {
  println(chain2("A BIKE"))
  println(chain2("An Elephant"))
  println(chain2("Garage"))
  println(chain2("A monitor"))
  println(chain2("Aardvark"))
}