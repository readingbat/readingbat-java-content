package recursion;

// @desc Trace the call stack — each call checks the first character and then counts occurrences in the rest of the string.

public class Recursion5 {

    public static int countChar(String s, char c) {
        if (s.isEmpty())
            return 0;
        int count = s.charAt(0) == c ? 1 : 0;
        return count + countChar(s.substring(1), c);
    }

    public static void main(String[] args) {
        System.out.println(countChar("hello", 'l'));
        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("mississippi", 's'));
        System.out.println(countChar("abc", 'z'));
        System.out.println(countChar("aaa", 'a'));
        System.out.println(countChar("", 'x'));
        System.out.println(countChar("bookkeeper", 'e'));
    }
}
