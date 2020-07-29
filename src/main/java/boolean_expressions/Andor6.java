// @desc Parentheses override the order of evaluation.
package boolean_expressions;

public class Andor6 {
    public static boolean Andor6(boolean val1, boolean val2, boolean val3) {
        boolean result = val1 && (val2 || val3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Andor6(true, true, true));
        System.out.println(Andor6(true, true, false));
        System.out.println(Andor6(true, false, true));
        System.out.println(Andor6(true, false, false));
        System.out.println(Andor6(false, true, true));
        System.out.println(Andor6(false, true, false));
        System.out.println(Andor6(false, false, true));
        System.out.println(Andor6(false, false, false));
    }
}