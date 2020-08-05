package string_ops;

public class Concat5 {

    public static String combine(int t, String s) {
        String result = "";
        for (int i = 0; i < t; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine(3, "Car"));
        System.out.println(combine(1, "Hello"));
        System.out.println(combine(4, "5"));
        System.out.println(combine(5, "ree"));
        System.out.println(combine(3, "Hi"));
        System.out.println(combine(4, "bat"));
        System.out.println(combine(5, ""));
        System.out.println(combine(4, " "));
        System.out.println(combine(0, "abc"));
    }
}