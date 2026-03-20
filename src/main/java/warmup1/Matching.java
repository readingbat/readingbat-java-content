package warmup1;

// desc Given a string, return true if the first 3 chars in the string also appear at the end of the string, such as with "edited".

public class Matching {

    public static boolean matching(String a) {
        if (a.length() < 3)
            return true;
        return a.substring(0, 3).equals(a.substring(a.length() - 3));
    }

    public static void main(String[] args) {
        System.out.println(matching("end end"));
        System.out.println(matching("Hello"));
        System.out.println(matching("World"));
        System.out.println(matching("Hi"));
        System.out.println(matching(""));
        System.out.println(matching("edited"));
        System.out.println(matching("????????"));
    }
}