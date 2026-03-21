package char_ops;

// @desc **Character.isUpperCase()** returns **true** only for uppercase letters. Digits and symbols are not uppercase.

public class CharCheck3 {

    public static boolean isUpper(char ch) {
        return Character.isUpperCase(ch);
    }

    public static void main(String[] args) {
        System.out.println(isUpper('A'));
        System.out.println(isUpper('a'));
        System.out.println(isUpper('Z'));
        System.out.println(isUpper('m'));
        System.out.println(isUpper('3'));
        System.out.println(isUpper(' '));
        System.out.println(isUpper('!'));
    }
}
