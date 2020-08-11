package transformations

val inRange1: (String) -> Boolean = { s: String -> s.startsWith("H") }

val inRange2: (String) -> Boolean = { it.toLowerCase().endsWith("at") }

fun filterIt1(vals: List<String>, func: (String) -> Boolean): List<String> {
  val list = mutableListOf<String>()
  for (v in vals) {
    if (func.invoke(v))
      list.add(v)
  }
  return list
}

fun filterIt2(vals: List<String>, func: (String) -> Boolean): List<String> {
  return vals.filter(func)
}

fun main() {
  println(filterIt1(listOf("hi", "HA"), inRange1))
  println(filterIt1(listOf("PAT", "at"), inRange2))
  println(filterIt2(listOf("hi", "HA"), inRange1))
  println(filterIt2(listOf("BAT", "HA"), inRange2))
  println(filterIt2(listOf("BAT", "HA"), { it.toUpperCase().endsWith("AT") }))
  println(filterIt2(listOf("BAT", "HA"), { it.toLowerCase().contains("a") }))
  println(filterIt2(listOf("BAT", "HA"), { it.capitalize().startsWith("B") }))
}