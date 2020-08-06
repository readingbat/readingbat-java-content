package warmup1;

public class LookForIt {

    public static boolean lookForIt(String str) {
        int c = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.substring(i, i + 1).equals("a"))
                c++;

        return c >= 2;
    }

    public static void main(String[] args) {
        System.out.println(lookForIt("aaabbb"));
        System.out.println(lookForIt("bbba"));
        System.out.println(lookForIt("aa"));
        System.out.println(lookForIt("a"));
        System.out.println(lookForIt(""));
        System.out.println(lookForIt("hello"));
    }
}
