package string_ops;

// @desc **replace()** swaps *every* occurrence of the old text with the new text.

public class Replace1 {

    public static String swapIt(String s, String old, String rep) {
        String result = s.replace(old, rep);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swapIt("hello", "l", "r"));
        System.out.println(swapIt("banana", "a", "o"));
        System.out.println(swapIt("aaa", "a", "b"));
        System.out.println(swapIt("hello", "x", "y"));
        System.out.println(swapIt("abcabc", "abc", "X"));
        System.out.println(swapIt("hello world", " ", "-"));
        System.out.println(swapIt("java", "av", "AV"));
    }
}
