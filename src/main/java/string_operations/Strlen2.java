package string_operations;

// @desc **len()** returns the length of a string.

public class Strlen2 {

    public static int strlen2(String s, String t) {
        int length = s.length() + t.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen2("Bike", "grass"));
        System.out.println(strlen2("", ""));
        System.out.println(strlen2("56", ""));
        System.out.println(strlen2("Cat", "Dog"));
        System.out.println(strlen2("Golf", "Ball"));
    }
}