package string_ops;

// @desc The first character in a string is at index 0.

public class Substr3 {

    public static String slice(String s) {
        int length = s.length();
        int mid = (int) (length / 2);
        return s.substring(mid);
    }

    public static void main(String[] args) {
        System.out.println(slice("Car"));
        System.out.println(slice("Hello"));
        System.out.println(slice("556843"));
        System.out.println(slice("Elephant"));
        System.out.println(slice("Roses"));
    }
}