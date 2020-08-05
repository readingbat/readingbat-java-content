package string_ops;

// @desc **len()** returns the length of a string.

public class Strlen3 {

    public static int strlen(String s, String t) {
        int length = 2 * s.length() + 3 * t.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen("ant", "duck"));
        System.out.println(strlen("", ""));
        System.out.println(strlen("", "78"));
        System.out.println(strlen("rock", "sand"));
        System.out.println(strlen("ex", "ball"));
    }
}