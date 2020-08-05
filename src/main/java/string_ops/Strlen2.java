package string_ops;

// @desc **len()** returns the length of a string.

public class Strlen2 {

    public static int strlen(String s, String t) {
        int length = s.length() + t.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen("Bike", "grass"));
        System.out.println(strlen("", ""));
        System.out.println(strlen("56", ""));
        System.out.println(strlen("Cat", "Dog"));
        System.out.println(strlen("Golf", "Ball"));
    }
}