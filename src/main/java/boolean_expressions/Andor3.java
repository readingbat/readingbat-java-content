// @desc The **not** operator flips a boolean value.
package boolean_expressions;

public class Andor3 {
    public static boolean Andor3(boolean val1, boolean val2) {
        boolean result = !(val1 && val2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Andor3(true, true));
        System.out.println(Andor3(true, false));
        System.out.println(Andor3(false, true));
        System.out.println(Andor3(false, false));
    }
}