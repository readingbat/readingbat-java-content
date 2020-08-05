package string_ops;

// @desc A slice is inclusive of the starting index and exclusive of the ending index.

public class Substr5 {

    public static String slice(String s) {
        String c = s.substring(2, 5);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice("Garage"));
        System.out.println(slice("Track"));
        System.out.println(slice("556843"));
        System.out.println(slice("Elephant"));
        System.out.println(slice("Violets"));
    }
}