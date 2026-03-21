package string_ops;

// @desc **length()** returns the total number of characters in a string, including spaces and punctuation.

public class Strlen1 {

    public static int strlen(String s) {
        int length = s.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen("Car"));
        System.out.println(strlen(""));
        System.out.println(strlen("5"));
        System.out.println(strlen("Elephant"));
        System.out.println(strlen("Roses"));
    }
}