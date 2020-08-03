package string_operations;

public class Slice2 {

    public static String slice2(String s) {
        String c = s.substring(s.length() - 1);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slice2("Car"));
        System.out.println(slice2("Truck"));
        System.out.println(slice2("55684"));
        System.out.println(slice2("Elephant"));
        System.out.println(slice2("Roses"));
    }
}