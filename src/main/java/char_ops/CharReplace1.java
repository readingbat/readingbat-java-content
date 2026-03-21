package char_ops;

// @desc Build a new string by replacing each vowel with '*'. Non-vowel characters stay the same.

public class CharReplace1 {

    public static String replaceVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result += "*";
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceVowels("hello"));
        System.out.println(replaceVowels("APPLE"));
        System.out.println(replaceVowels("xyz"));
        System.out.println(replaceVowels(""));
        System.out.println(replaceVowels("aEiOu"));
        System.out.println(replaceVowels("Java"));
        System.out.println(replaceVowels("rhythm"));
    }
}
