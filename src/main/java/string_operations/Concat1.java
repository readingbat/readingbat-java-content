package string_operations;

// @desc The **+** operator combines two strings into a new string

public class Concat1 {

    public static String concat1(String s1, String s2) {
        String result = s1 + s2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(concat1("Car", "wash"));
        System.out.println(concat1("Hello", " world"));
        System.out.println(concat1("5", "8"));
        System.out.println(concat1("Snow", "ball"));
        System.out.println(concat1("Rain", "boots"));
        System.out.println(concat1("Reading", "bat"));
        System.out.println(concat1("AAA", "Hi"));
        System.out.println(concat1("Hi", "there"));
        System.out.println(concat1(" ", " "));
    }
}