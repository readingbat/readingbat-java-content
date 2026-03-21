package char_ops;

// @desc Count the vowels (a, e, i, o, u) in the string. Remember to check both uppercase and lowercase.

public class CharCount1 {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello"));
        System.out.println(countVowels("AEIOU"));
        System.out.println(countVowels("xyz"));
        System.out.println(countVowels(""));
        System.out.println(countVowels("aEiOu"));
        System.out.println(countVowels("rhythm"));
        System.out.println(countVowels("Java"));
    }
}
