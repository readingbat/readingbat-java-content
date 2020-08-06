package warmup1;

public class Searching2 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();

        for (int i = 0; i <= a.length() - len; i++)
            if (a.contains(c))
                return true;

        for (int i = 0; i <= b.length() - len; i++)
            if (b.contains(c))
                return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(search("Bohemian", "Rhapsody", "pa"));
        System.out.println(search("Hello", "World", "!"));
        System.out.println(search("!!", "??", "aaaa"));
        System.out.println(search("Ok", "Then...", "..."));
        System.out.println(search("Hello", "World", "e"));
        System.out.println(search("Computational", "Thinking", "Hi"));
    }
}