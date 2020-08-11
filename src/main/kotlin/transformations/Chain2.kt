package transformations

fun chain2(s: String): String {
  return s.asSequence()
    .map { it.toUpperCase().toString() + it.toLowerCase().toString() }
    .filter { "a" in it }
    .joinToString("-")
}

fun main() {
  println(chain2("A BIKE"))
  println(chain2("An Elephant"))
  println(chain2("Garage"))
  println(chain2("A monitor"))
  println(chain2("Aardvark"))
}