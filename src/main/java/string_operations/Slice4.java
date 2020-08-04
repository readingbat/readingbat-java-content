package string_operations;

// @desc A slice is inclusive of the starting index and exclusive of the ending index.

public class Slice4 {

    public static String slice(String s) {
        String c = s.substring(0, 2);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice("Car"));
        System.out.println(slice("Truck"));
        System.out.println(slice("556843"));
        System.out.println(slice("Elephant"));
        System.out.println(slice("Roses"));
    }
}