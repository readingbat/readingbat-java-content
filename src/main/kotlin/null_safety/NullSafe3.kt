package null_safety

// @desc Safe calls can be chained — if any step produces **null**, the rest of the chain is skipped.

fun safeChainLength(s: String?): Int = s?.trim()?.uppercase()?.length ?: 0

fun main() {
  println(safeChainLength("hello"))
  println(safeChainLength(null))
  println(safeChainLength("  abc  "))
  println(safeChainLength(""))
  println(safeChainLength("  "))
  println(safeChainLength(" Kotlin "))
}
