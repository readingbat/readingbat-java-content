package warmup1;

// @desc Notice the lack of curly braces inside the embedded for loop.

public class SearchingBoth2 {

    public static boolean search(String a, String b, String c) {
        int len = c.length();

        for (int i = 0; i <= a.length() - len; i++)
            if (a.substring(i, i + len).equals(c))
                for (int j = 0; j <= b.length() - len; j++)
                    if (b.substring(j, j + len).equals(c))
                        return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search("Bohemian", "Rhapsody", "pa"));
        System.out.println(search("Hello", "World", "!"));
        System.out.println(search("Ok", "Then...", "..."));
        System.out.println(search("Computational", "Thinking", "Hi"));
        System.out.println(search("Hello", "World", "e"));
        System.out.println(search("!!", "??", "aaaa"));
    }
}