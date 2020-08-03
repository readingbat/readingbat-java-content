package string_operations;

// @desc The 2nd character in a string is at index 1.

public class Combine2 {

    public static String combine2(String s1, String s2) {
        String s3 = s1.substring(1);
        String s4 = s2.substring(1);
        String result = s3 + s4;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine2("Car", "wash"));
        System.out.println(combine2("Hello", " world"));
        System.out.println(combine2("5", "8"));
        System.out.println(combine2("Snow", "ball"));
        System.out.println(combine2("Rain", "boots"));
        System.out.println(combine2("Reading", "bat"));
        System.out.println(combine2("AAA", "Hi"));
        System.out.println(combine2("Hi", "there"));
        System.out.println(combine2(" ", " "));
    }
}