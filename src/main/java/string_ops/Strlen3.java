package string_ops;

// @desc Compute the **length()** of each string separately, then apply the multipliers before adding the results together.

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