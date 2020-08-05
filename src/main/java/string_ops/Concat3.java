package string_ops;

// @desc The 2nd character in a string is at index 1.

public class Concat3 {

    public static String combine(String s1, String s2) {
        String s3 = s1.substring(1);
        String s4 = s2.substring(1);
        String result = s3 + s4;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine("Car", "wash"));
        System.out.println(combine("Hello", " world"));
        System.out.println(combine("5", "8"));
        System.out.println(combine("Snow", "ball"));
        System.out.println(combine("Rain", "boots"));
        System.out.println(combine("Reading", "bat"));
        System.out.println(combine("AAA", "Hi"));
        System.out.println(combine("Hi", "there"));
        System.out.println(combine(" ", " "));
    }
}