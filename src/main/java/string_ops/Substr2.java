package string_ops;

// @desc Notice **substr()** can also be called with a single argument.

public class Substr2 {

    public static String slice(String s) {
        String c = s.substring(s.length() - 1);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice("Car"));
        System.out.println(slice("Truck"));
        System.out.println(slice("55684"));
        System.out.println(slice("Elephant"));
        System.out.println(slice("Roses"));
    }
}