package string_operations;

public class Concat3 {

    public static String concat3(int t, String s) {
        String result = "";
        for (int i = 0; i < t; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(concat3(3, "Car"));
        System.out.println(concat3(1, "Hello"));
        System.out.println(concat3(9, "5"));
        System.out.println(concat3(5, "ree"));
        System.out.println(concat3(3, "Hi"));
        System.out.println(concat3(4, "bat"));
        System.out.println(concat3(5, ""));
        System.out.println(concat3(4, " "));
        System.out.println(concat3(0, "abc"));
    }
}