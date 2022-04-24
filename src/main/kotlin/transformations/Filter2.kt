package transformations

val inRange1: (String) -> Boolean = { s: String -> s.startsWith("H") }

val inRange2: (String) -> Boolean = { it.lowercase().endsWith("at") }

fun filterIt2Long(vals: List<String>, func: (String) -> Boolean): List<String> {
  val list = mutableListOf<String>()
  for (v in vals) {
    if (func.invoke(v))
      list.add(v)
  }
  return list
}

fun filterIt2Short(vals: List<String>, func: (String) -> Boolean): List<String> = vals.filter(func)

fun main() {
  println(filterIt2Long(listOf("hi", "HA"), inRange1))
  println(filterIt2Long(listOf("PAT", "at"), inRange2))
  println(filterIt2Short(listOf("hi", "HA"), inRange1))
  println(filterIt2Short(listOf("BAT", "HA"), inRange2))
  println(filterIt2Short(listOf("BAT", "HA"), { s: String -> s.uppercase().endsWith("AT") }))
  println(filterIt2Short(listOf("BAT", "HA"), { it.lowercase().contains("a") }))
  println(filterIt2Short(listOf("BAT", "HA"), { it.capitalize().startsWith("B") }))
}