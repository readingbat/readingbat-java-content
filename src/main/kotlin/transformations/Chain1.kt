package transformations

fun chain1(s: String): String {
  return s.asSequence()
    .map { it.uppercase() }
    .filter { it in ("A".."F") }
    .map { it.lowercase() }
    .joinToString(", ")
}

fun main() {
  println(chain1("BIKE"))
  println(chain1("Elephant"))
  println(chain1("garage"))
  println(chain1("DECK"))
  println(chain1("House"))
}