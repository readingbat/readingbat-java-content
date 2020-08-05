package string_ops;

public class Concat2 {

    public static String combine(String s1, String s2, String s3) {
        String result = s1 + s2 + s3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine("Car", "wash", " needed"));
        System.out.println(combine("He", "llo", " world"));
        System.out.println(combine("5", "8", "1"));
        System.out.println(combine("Snow", "ball", " fight"));
        System.out.println(combine("Rain", "boots", ""));
        System.out.println(combine("Reading", "bat", " is fun"));
        System.out.println(combine("", "Hi", ""));
        System.out.println(combine("", "", ""));
        System.out.println(combine(" ", " ", " "));
    }
}