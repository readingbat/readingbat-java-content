package switch_stmts;

// @desc The for loop visits each character and the switch checks if it is a vowel. Count how many vowels are found.

public class Switch5 {

    public static int countVowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello"));
        System.out.println(countVowels("aeiou"));
        System.out.println(countVowels("xyz"));
        System.out.println(countVowels("programming"));
        System.out.println(countVowels(""));
        System.out.println(countVowels("a"));
        System.out.println(countVowels("bcd"));
    }
}
