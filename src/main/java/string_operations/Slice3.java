package string_operations;

// @desc The first character in a string is at index 0.

public class Slice3 {

    public static String slice3(String s) {
        int length = s.length();
        int mid = (int) (length / 2);
        String c = s.substring(mid);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice3("Car"));
        System.out.println(slice3("Truck"));
        System.out.println(slice3("556843"));
        System.out.println(slice3("Elephant"));
        System.out.println(slice3("Roses"));
    }
}