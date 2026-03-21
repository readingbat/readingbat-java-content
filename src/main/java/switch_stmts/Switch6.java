package switch_stmts;

// @desc The character is checked against ranges to classify it. Trace which category the switch selects.

public class Switch6 {

    public static String classify(char c) {
        switch (Character.getType(c)) {
            case Character.UPPERCASE_LETTER:
            case Character.LOWERCASE_LETTER:
                return "letter";
            case Character.DECIMAL_DIGIT_NUMBER:
                return "digit";
            case Character.SPACE_SEPARATOR:
                return "space";
            default:
                return "other";
        }
    }

    public static void main(String[] args) {
        System.out.println(classify('a'));
        System.out.println(classify('Z'));
        System.out.println(classify('5'));
        System.out.println(classify(' '));
        System.out.println(classify('!'));
        System.out.println(classify('m'));
        System.out.println(classify('0'));
    }
}
