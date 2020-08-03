package string_operations;

// @desc **len()** returns the length of a string.

public class Strlen3 {

    public static int strlen3(String s, String t) {
        int length = 2 * s.length() + 3 * t.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen3("ant", "duck"));
        System.out.println(strlen3("", ""));
        System.out.println(strlen3("", "78"));
        System.out.println(strlen3("rock", "sand"));
        System.out.println(strlen3("ex", "ball"));
    }
}