package string_operations;

public class Concat2 {

    public static String concat2(String s1, String s2, String s3) {
        String result = s1 + s2 + s3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(concat2("Car", "wash", " needed"));
        System.out.println(concat2("He", "llo", " world"));
        System.out.println(concat2("5", "8", "1"));
        System.out.println(concat2("Snow", "ball", " fight"));
        System.out.println(concat2("Rain", "boots", ""));
        System.out.println(concat2("Reading", "bat", " is fun"));
        System.out.println(concat2("", "Hi", ""));
        System.out.println(concat2("", "", ""));
        System.out.println(concat2(" ", " ", " "));
    }
}