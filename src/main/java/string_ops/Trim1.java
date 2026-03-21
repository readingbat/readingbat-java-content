package string_ops;

// @desc **trim()** removes spaces from both ends of a string but leaves the middle untouched.

public class Trim1 {

    public static String trimIt(String s) {
        String result = s.trim();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(trimIt("  hello  "));
        System.out.println(trimIt("world"));
        System.out.println(trimIt("  abc"));
        System.out.println(trimIt("xyz  "));
        System.out.println(trimIt("  hi there  "));
        System.out.println(trimIt("   "));
        System.out.println(trimIt("a"));
    }
}
