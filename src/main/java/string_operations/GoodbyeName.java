package string_operations;

public class GoodbyeName {

    public static String goodbyeName(String name) {
        return "Goodbye " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(goodbyeName("person"));
        System.out.println(goodbyeName("everyone"));
        System.out.println(goodbyeName("5"));
        System.out.println(goodbyeName("alpha"));
        System.out.println(goodbyeName("rain"));
        System.out.println(goodbyeName("school"));
        System.out.println(goodbyeName(""));
        System.out.println(goodbyeName("Matt"));
    }
}