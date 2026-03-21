package recursion;

// @desc Follow each recursive call to the base case — the first character is moved to the end after reversing the rest of the string.

public class Recursion4 {

    public static String reverse(String s) {
        if (s.length() <= 1)
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse("abc"));
        System.out.println(reverse("a"));
        System.out.println(reverse("ab"));
        System.out.println(reverse("racecar"));
        System.out.println(reverse("Java"));
        System.out.println(reverse("12345"));
    }
}
