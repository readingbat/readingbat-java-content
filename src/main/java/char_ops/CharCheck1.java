package char_ops;

// @desc **Character.isLetter()** returns **true** if the char is a letter (a-z or A-Z). Trace each call carefully.

public class CharCheck1 {

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static void main(String[] args) {
        System.out.println(isLetter('A'));
        System.out.println(isLetter('z'));
        System.out.println(isLetter('3'));
        System.out.println(isLetter(' '));
        System.out.println(isLetter('!'));
        System.out.println(isLetter('M'));
        System.out.println(isLetter('0'));
    }
}
