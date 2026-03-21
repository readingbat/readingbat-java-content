package char_ops;

// @desc **Character.isDigit()** returns **true** if the char is a digit (0-9). Watch for chars that look like numbers but aren't.

public class CharCheck2 {

    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static void main(String[] args) {
        System.out.println(isDigit('5'));
        System.out.println(isDigit('0'));
        System.out.println(isDigit('9'));
        System.out.println(isDigit('a'));
        System.out.println(isDigit(' '));
        System.out.println(isDigit('Z'));
        System.out.println(isDigit('#'));
    }
}
