package string_operations;

// @desc The first character in a string is at index 0.

public class Slice1 {

    public static String slice1(String s) {
        String c = s.substring(0, 1);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice1("Car"));
        System.out.println(slice1("Truck"));
        System.out.println(slice1("55684"));
        System.out.println(slice1("Elephant"));
        System.out.println(slice1("Roses"));
    }
}