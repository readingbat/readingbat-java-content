package string_operations;

//@desc **len()** returns the length of a string.

public class Strlen1 {

    public static int strlen1(String s) {
        int length = s.length();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(strlen1("Car"));
        System.out.println(strlen1(""));
        System.out.println(strlen1("5"));
        System.out.println(strlen1("Elephant"));
        System.out.println(strlen1("Roses"));
    }
}