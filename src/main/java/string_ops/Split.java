package string_ops;

// @desc Casting with **(int)** truncates values. **int(5/2)** equals 2

public class Split {

    public static String split(String out, String word) {
        int halfway = (int) (out.length() / 2);
        return out.substring(0, halfway) + word + out.substring(halfway);
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