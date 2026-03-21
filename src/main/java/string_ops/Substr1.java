package string_ops;

// @desc **substring(start, end)** extracts characters starting at index **start** up to but *not including* index **end**.

public class Substr1 {

    public static String slice(String s) {
        String c = s.substring(0, 1);
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