package recursion;

// @desc Trace the call stack — compare the first and last characters, then check if the middle substring is also a palindrome.

public class Recursion7 {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abc"));
    }
}
