package for_loops;

// @desc Notice the loop's step size — the loop variable doesn't always increase by 1.

public class ForLoop4 {

    public static int loopIt(String str, String x) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(x))
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("athenian", "e"));
        System.out.println(loopIt("apples", "a"));
        System.out.println(loopIt("hello", "a"));
        System.out.println(loopIt("alphabet", "h"));
        System.out.println(loopIt("aaaaa", "b"));
    }
}