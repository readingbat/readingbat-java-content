package for_loops;

// @desc The loop checks each character — keep a running count of matches.

public class ForLoop7 {

    public static int loopIt(String str, String ch) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(ch))
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("hello", "l"));
        System.out.println(loopIt("banana", "a"));
        System.out.println(loopIt("mississippi", "s"));
        System.out.println(loopIt("abcdef", "z"));
        System.out.println(loopIt("aaa", "a"));
        System.out.println(loopIt("", "x"));
        System.out.println(loopIt("bookkeeper", "e"));
    }
}
