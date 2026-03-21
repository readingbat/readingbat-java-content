package char_ops;

// @desc Loop through the string and count uppercase letters. Digits and symbols don't count as uppercase.

public class CharCount3 {

    public static int countUpper(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countUpper("Hello World"));
        System.out.println(countUpper("ABCDEF"));
        System.out.println(countUpper("abcdef"));
        System.out.println(countUpper(""));
        System.out.println(countUpper("HeLLo"));
        System.out.println(countUpper("123ABC"));
        System.out.println(countUpper("javaCode"));
    }
}
