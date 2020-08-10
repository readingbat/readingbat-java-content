package warmup1;

public class Searching5 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();
        boolean found1 = false;
        boolean found2 = false;

        for (int i = 2; i <= a.length() - len; i++)
            if (a.substring(i, i + len).equals(c))
                if (a.substring(i - 2, i).equals("aa"))
                    found1 = true;

        for (int i = 2; i <= b.length() - len; i++)
            if (b.substring(i, i + len).equals(c))
                if (b.substring(i - 2, i).equals("aa"))
                    found2 = true;

        return found1 && found2;
    }

    public static void main(String[] args) {
        System.out.println(search("Hello", "World", "!"));
        System.out.println(search("Computataaional", "Thinkaaing", "i"));
        System.out.println(search("Hello", "World", "o"));
        System.out.println(search("aa...", "Thenaa...", "..."));
        System.out.println(search("Bohemiaan", "Rhaapsody", "a"));
        System.out.println(search("aa!!", "aa!!??", "!!"));
    }
}