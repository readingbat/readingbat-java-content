package string_operations;

// @desc **s[-1]** is the last character of a string\

public class Combine1 {

    public static String combine1(String s1, String s2) {
        String s3 = s1.substring(0, 1) + s1.substring(s1.length() - 2, s1.length() - 1);
        String s4 = s2.substring(0, 1) + s2.substring(s2.length() - 2, s2.length() - 1);
        String result = s3 + s4;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine1("Car", "wash"));
        System.out.println(combine1("Hello", " world"));
        System.out.println(combine1("5", "8"));
        System.out.println(combine1("Snow", "ball"));
        System.out.println(combine1("Rain", "boots"));
        System.out.println(combine1("Reading", "bat"));
        System.out.println(combine1("AAA", "Hi"));
        System.out.println(combine1("Hi", "there"));
        System.out.println(combine1(" ", " "));
    }
}