package boolean_exprs;

// @desc Truth tables

public class AndOr2 {

    public static boolean compare(boolean val1, boolean val2) {
        boolean result = val1 || val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(true, true));
        System.out.println(compare(true, false));
        System.out.println(compare(false, true));
        System.out.println(compare(false, false));
    }
}