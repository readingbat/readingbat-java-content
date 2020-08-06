package warmup2;

public class LookForIt {

    public static boolean lookForIt(String str, String letter) {
        int c = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.substring(i, i + 1).equals(letter))
                c++;

        return c >= 2;
    }

    public static void main(String[] args) {
        System.out.println(lookForIt("aaabbb", "a"));
        System.out.println(lookForIt("bbba", "b"));
        System.out.println(lookForIt("aa", "c"));
        System.out.println(lookForIt("a", "d"));
        System.out.println(lookForIt("", "e"));
    }
}
