// @desc Truth tables
package boolean_expressions;

public class Andor2 {
    public static boolean Andor2(boolean val1, boolean val2) {
        boolean result = val1 || val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Andor2(true, true));
        System.out.println(Andor2(true, false));
        System.out.println(Andor2(false, true));
        System.out.println(Andor2(false, false));
    }
}