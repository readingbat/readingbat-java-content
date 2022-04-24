package strings

fun stringElements3(s: String, list: List<Int>): String =
    buildString {
        list.filter { it % 2 == 0 }
            .forEach { append(s[it]) }
    }

fun main() {
    println(stringElements3("abcdefgh", listOf(3, 2, 1, 0)))
    println(stringElements3("hello there", listOf(0, 1, 2, 4)))
    println(stringElements3("This is a test", listOf(4, 2, 2, 0)))
    println(stringElements3("How was your day?", listOf(0, 4, 4, 3, 7, 7)))
    println(stringElements3("Welcome to ReadingBat", listOf(1, 4, 2, 6, 8)))
}