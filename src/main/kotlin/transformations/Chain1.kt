package transformations

// @desc Work through the chain left to right: uppercase each character, filter to keep only **A–F**, then lowercase.

fun chain1(s: String): String =
  s.asSequence()
    .map { it.uppercase() }
    .filter { it in ("A".."F") }
    .map { it.lowercase() }
    .joinToString(", ")

fun main() {
  println(chain1("BIKE"))
  println(chain1("Elephant"))
  println(chain1("garage"))
  println(chain1("DECK"))
  println(chain1("House"))
}