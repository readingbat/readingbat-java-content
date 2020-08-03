package string_operations;

// @desc The **int()** function truncates values. **int(5/2)** equals 2

public class Split {

    public static String split(String out, String word) {
        int length = (int) (out.length() / 2);
        return out.substring(0, length) + word + out.substring(length);
    }

    public static void main(String[] args) {
        System.out.println(split("Hello", "World"));
        System.out.println(split("Person", "a"));
        System.out.println(split("Alpha", "Omega"));
        System.out.println(split("Rain", "boots"));
        System.out.println(split("School", "bus"));
        System.out.println(split("", "Hi"));
        System.out.println(split("Matt", ""));
        System.out.println(split("5", "8"));
    }
}