package warmup1;

public class SearchingBoth1 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();
        boolean found1 = false;
        boolean found2 = false;

        for (int i = 0; i <= a.length() - len; i++)
            if (a.substring(i, i + len).equals(c))
                found1 = true;

        for (int i = 0; i <= b.length() - len; i++)
            if (b.substring(i, i + len).equals(c))
                found2 = true;

        return found1 && found2;
    }

    public static void main(String[] args) {
        System.out.println(search("Hello", "World", "!"));
        System.out.println(search("Hello", "World", "o"));
        System.out.println(search("Bohemian", "Rhapsody", "a"));
        System.out.println(search("!!", "??", "aaaa"));
        System.out.println(search("Computational", "Thinking", "i"));
        System.out.println(search("Ok...", "Then...", "..."));
    }
}