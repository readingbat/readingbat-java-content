package boolean_exprs;

public class AndOr7 {

    public static boolean compare(boolean val1, boolean val2, boolean val3) {
        boolean result = val1 || val2 || val3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(true, true, true));
        System.out.println(compare(true, true, false));
        System.out.println(compare(true, false, true));
        System.out.println(compare(true, false, false));
        System.out.println(compare(false, true, true));
        System.out.println(compare(false, true, false));
        System.out.println(compare(false, false, true));
        System.out.println(compare(false, false, false));
    }
}