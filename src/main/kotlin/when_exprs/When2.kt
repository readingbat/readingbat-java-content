package when_exprs

// @desc **in** checks if a value falls within a range — ranges are inclusive on both ends.

fun letterGrade(score: Int): String =
  when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "F"
  }

fun main() {
  println(letterGrade(95))
  println(letterGrade(90))
  println(letterGrade(85))
  println(letterGrade(80))
  println(letterGrade(72))
  println(letterGrade(65))
  println(letterGrade(59))
  println(letterGrade(0))
}
