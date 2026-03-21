package string_ops;

// @desc **substring(2, 5)** extracts characters at indices 2, 3, and 4. Count carefully from index 0 to find the right letters.

public class Substr5 {

    public static String slice(String s) {
        return s.substring(2, 5);
    }

    public static void main(String[] args) {
        System.out.println(slice("Garage"));
        System.out.println(slice("Track"));
        System.out.println(slice("556843"));
        System.out.println(slice("Elephant"));
        System.out.println(slice("Violets"));
    }
}