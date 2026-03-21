package char_ops;

// @desc Toggle each letter's case: uppercase becomes lowercase and vice versa. Non-letters stay unchanged.

public class CharConvert2 {

    public static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello"));
        System.out.println(toggleCase("JAVA"));
        System.out.println(toggleCase("code"));
        System.out.println(toggleCase(""));
        System.out.println(toggleCase("HeLLo WoRLd"));
        System.out.println(toggleCase("abc123"));
        System.out.println(toggleCase("ABCdef"));
    }
}
