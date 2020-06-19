package warmup1;

public class StringLength {

    public static int examine(String str) {
        int c = 0;

        if (str.length() < 2)
            return -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a"))
                c++;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(examine("aaabbb"));
        System.out.println(examine("bbba"));
        System.out.println(examine("aa"));
        System.out.println(examine("a"));
        System.out.println(examine(""));
        System.out.println(examine("hello"));
    }
}
