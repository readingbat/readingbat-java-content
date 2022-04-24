package strings

fun stringElements1(s: String, list: List<Int>): String =
    buildString {
        list.forEach { append(s[it]) }
    }

fun main() {
    println(stringElements1("abcd", listOf(3, 2, 1, 0)))
    println(stringElements1("hello", listOf(0, 1, 2, 4)))
    println(stringElements1("This is a test", listOf(6, 2, 7, 2, 0)))
    println(stringElements1("How was your day?", listOf(0, 4, 4, 3, 7, 7)))
    println(stringElements1("Welcome to ReadingBat", listOf(11, 11, 11, 11)))
}