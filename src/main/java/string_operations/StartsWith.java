package string_operations;

// @desc **startswith()** returns True if a string starts with a specified substring.

public class StartsWith {

    public static boolean startsWith(String s1, String s2) {
        boolean result = s2.startsWith(s1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(startsWith("H", "Hello"));
        System.out.println(startsWith("el", "Hello"));
        System.out.println(startsWith("Hel", "Hello"));
        System.out.println(startsWith("5", "525"));
        System.out.println(startsWith("52", "525"));
        System.out.println(startsWith("25", "525"));
        System.out.println(startsWith("E", "Egg"));
        System.out.println(startsWith("", "World"));
        System.out.println(startsWith(" ", " Hello World"));
        System.out.println(startsWith(" ", "HelloWorld"));
    }
}