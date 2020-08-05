package string_ops;

public class Concat4 {

    public static String combine(String s1, String s2) {
        String s3;
        String s4;

        if (s1.length() < 3) {
            s3 = s1;
        } else {
            s3 = s1.substring(0, 1) + s1.substring(s1.length() - 2, s1.length() - 1);
        }

        if (s2.length() < 3) {
            s4 = s2;
        } else {
            s4 = s2.substring(0, 1) + s2.substring(s2.length() - 2, s2.length() - 1);
        }
        return s3 + s4;
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