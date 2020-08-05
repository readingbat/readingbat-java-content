package string_ops;

// @desc The **+** operator combines two strings into a new string

public class Concat1 {

    public static String combine(String s1, String s2) {
        String result = s1 + s2;
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