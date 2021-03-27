package warmup1;

public class Searching2 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();

        if (a.contains(c))
            return true;

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