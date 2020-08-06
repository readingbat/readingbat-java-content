package warmup1;

public class FirstLast {

    public static String firstLast(String a, String b) {

        String result;
        String aChar;
        String bChar;

        if (a.length() == 0)
            aChar = "$";
        else
            aChar = a.substring(a.length() - 1);

        if (b.length() == 0)
            bChar = "$";
        else
            bChar = b.substring(0, 1);

        result = aChar + bChar;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstLast("Hello", "World"));
        System.out.println(firstLast("Wow", "Hi"));
        System.out.println(firstLast("Computational", "Thinking"));
        System.out.println(firstLast("1143", "994"));
        System.out.println(firstLast("", "oOf"));
        System.out.println(firstLast("", ""));
    }
}