package string_ops;

// @desc **endsWith()** checks whether a string finishes with the given text.

public class EndsWith {

    public static boolean endsWith(String s1, String s2) {
        boolean result = s2.endsWith(s1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(endsWith("o", "Hello"));
        System.out.println(endsWith("ll", "Hello"));
        System.out.println(endsWith("llo", "Hello"));
        System.out.println(endsWith("5", "525"));
        System.out.println(endsWith("52", "525"));
        System.out.println(endsWith("25", "525"));
        System.out.println(endsWith("g", "Egg"));
        System.out.println(endsWith("", "World"));
        System.out.println(endsWith(" ", "Hello World "));
        System.out.println(endsWith(" ", "HelloWorld"));
    }
}