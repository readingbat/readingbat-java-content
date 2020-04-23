package warmup1;

public class FrontBack {

    public static String frontBack(String str) {
        if (str.length() < 2)
            return str;

        String b = str.substring(0, 1);
        String e = str.substring(str.length() - 1, str.length());
        String m = str.substring(1, str.length() - 1);

        return e + m + b;
    }

    public static void main(String[] args) {
        System.out.println(frontBack("This is a test"));
        System.out.println(frontBack(""));
    }
}
