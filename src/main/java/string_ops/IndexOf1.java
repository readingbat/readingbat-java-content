package string_ops;

// @desc **indexOf()** returns the position of the first match, or **-1** if not found.

public class IndexOf1 {

    public static int findIt(String s, String sub) {
        int result = s.indexOf(sub);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findIt("hello", "ell"));
        System.out.println(findIt("hello", "xyz"));
        System.out.println(findIt("banana", "ana"));
        System.out.println(findIt("abcdef", "a"));
        System.out.println(findIt("abcdef", "f"));
        System.out.println(findIt("abcdef", "cd"));
        System.out.println(findIt("hello", ""));
    }
}
