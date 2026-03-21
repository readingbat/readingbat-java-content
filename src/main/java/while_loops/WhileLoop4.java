package while_loops;

// @desc The loop checks each character — it stops and returns the index when it finds a match, or **-1** if it never does.

public class WhileLoop4 {

    public static int findChar(String str, char ch) {
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ch)
                return i;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findChar("hello", 'e'));
        System.out.println(findChar("hello", 'l'));
        System.out.println(findChar("hello", 'z'));
        System.out.println(findChar("abcde", 'a'));
        System.out.println(findChar("abcde", 'e'));
        System.out.println(findChar("", 'x'));
        System.out.println(findChar("banana", 'n'));
    }
}
