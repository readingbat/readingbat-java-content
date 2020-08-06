package warmup1;

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
        System.out.println(matching("????????"));
    }
}