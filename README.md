# ReadingBat Java Content

Java and Kotlin programming challenges for the [ReadingBat](https://github.com/readingbat/readingbat-core) platform. This repository defines challenge content that the ReadingBat server renders as interactive coding exercises.

## Getting Started

Requires JDK 17+.

```bash
./gradlew build -x test        # Compile
./gradlew run                   # Start the content server on http://localhost:8080
./gradlew --rerun-tasks check   # Run all tests
```

## Challenge Structure

Each challenge is a standalone source file with a `main()` that prints expected outputs. Those output lines become the answer key for the exercise.

**Java** (`src/main/java/<package>/`):
```java
// @desc Determine if one value is less than another with the **<** operator.
public class LessThan {
    public static boolean compare(int val1, int val2) {
        return val1 < val2;
    }
    public static void main(String[] args) {
        System.out.println(compare(4, 6));   // true
        System.out.println(compare(12, 8));  // false
    }
}
```

**Kotlin** (`src/main/kotlin/<package>/`):
```kotlin
fun doubleIt(i: Int): Int = i * 2

fun main() {
    println(doubleIt(5))   // 10
    println(doubleIt(10))  // 20
}
```

All challenges are registered in `src/main/kotlin/Content.kt` using the `readingBatContent` DSL.
