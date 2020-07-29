// @desc Truth tables
package boolean_expressions;

public class Andor1 {
    public static boolean Andor1(boolean val1, boolean val2) {
        boolean result = val1 && val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Andor1(true, true));
        System.out.println(Andor1(true, false));
        System.out.println(Andor1(false, true));
        System.out.println(Andor1(false, false));
    }
}