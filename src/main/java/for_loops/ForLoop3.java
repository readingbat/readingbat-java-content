package for_loops;

// @desc The .substring() method returns a portion of a string.

public class ForLoop3 {

    public static int loopIt(String str, int x) {
        int result = 0;

        for (int i = x; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a"))
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("athenian", 1));
        System.out.println(loopIt("apples", 2));
        System.out.println(loopIt("hello", 3));
        System.out.println(loopIt("alphabet", 0));
        System.out.println(loopIt("aaaaa", 3));
        System.out.println(loopIt("aaaaa", 4));
        System.out.println(loopIt("aaaaa", 5));
    }
}