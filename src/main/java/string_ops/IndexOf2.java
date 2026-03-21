package string_ops;

// @desc **lastIndexOf()** searches from the end — it finds the *last* occurrence.

public class IndexOf2 {

    public static int findIt(String s, String sub) {
        int result = s.lastIndexOf(sub);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findIt("banana", "ana"));
        System.out.println(findIt("hello", "l"));
        System.out.println(findIt("abcabc", "abc"));
        System.out.println(findIt("abcdef", "xyz"));
        System.out.println(findIt("aaa", "a"));
        System.out.println(findIt("hello", "o"));
        System.out.println(findIt("mississippi", "ss"));
    }
}
