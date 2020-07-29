package for_loops;

// @desc The .substring() method returns a portion of a string.

public class ForLoop2 {

    public static int loopIt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("athenian"));
        System.out.println(loopIt("apples"));
        System.out.println(loopIt("hello"));
        System.out.println(loopIt(""));
        System.out.println(loopIt(" "));
        System.out.println(loopIt("alphabet"));
    }
}