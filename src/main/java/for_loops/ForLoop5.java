package for_loops;

// @desc Trace through each iteration, checking which characters pass the **if** test and get added to the result.

public class ForLoop5 {

    public static int loopIt(String str, String x, int y) {
        int result = 0;

        for (int i = y; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(x))
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("athenian", "e", 2));
        System.out.println(loopIt("apples", "p", 1));
        System.out.println(loopIt("hello", "a", 3));
        System.out.println(loopIt("aa", "a", 1));
    }
}