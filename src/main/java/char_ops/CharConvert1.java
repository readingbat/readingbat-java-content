package char_ops;

// @desc Casting a **char** to **int** gives its ASCII value. For example, 'A' is 65 and 'a' is 97.

public class CharConvert1 {

    public static int toAscii(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        System.out.println(toAscii('A'));
        System.out.println(toAscii('a'));
        System.out.println(toAscii('Z'));
        System.out.println(toAscii('0'));
        System.out.println(toAscii(' '));
        System.out.println(toAscii('9'));
        System.out.println(toAscii('!'));
    }
}
