package for_loops;

// @desc The .substring() method returns a portion of a string.

public class ForLoop3 {

    public static int LoopIt(String str, int x) {
        int result = 0;
        for (int i = x; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LoopIt("athenian", 1));
        System.out.println(LoopIt("apples", 2));
        System.out.println(LoopIt("hello", 3));
        System.out.println(LoopIt("alphabet", 0));
        System.out.println(LoopIt("aaaaa", 3));
        System.out.println(LoopIt("aaaaa", 4));
        System.out.println(LoopIt("aaaaa", 5));
    }
}