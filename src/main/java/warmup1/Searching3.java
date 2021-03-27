package warmup1;

public class Searching3 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();
        boolean found1 = false;
        boolean found2 = false;

        if (a.contains(c))
            found1 = true;

        if (b.indexOf(c) != -1)
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