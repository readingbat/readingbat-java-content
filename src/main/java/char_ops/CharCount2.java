package char_ops;

// @desc Loop through each character and count how many are digits. Use **Character.isDigit()** to test each char.

public class CharCount2 {

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits("abc123"));
        System.out.println(countDigits("hello"));
        System.out.println(countDigits("99bottles"));
        System.out.println(countDigits(""));
        System.out.println(countDigits("2024"));
        System.out.println(countDigits("a1b2c3"));
        System.out.println(countDigits("no digits here"));
    }
}
