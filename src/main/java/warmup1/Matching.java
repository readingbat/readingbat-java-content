package warmup1;

// @desc Compare the first few characters with the last few — **substring()** can extract both ends.

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