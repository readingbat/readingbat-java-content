package string_operations;

// @desc A slice is inclusive of the starting index and exclusive of the ending index.

public class Slice5 {
    public static String slice5(String s) {
        String c = s.substring(2, 5);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice5("Garage"));
        System.out.println(slice5("Track"));
        System.out.println(slice5("556843"));
        System.out.println(slice5("Elephant"));
        System.out.println(slice5("Violets"));
    }
}