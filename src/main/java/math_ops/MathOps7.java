package math_ops;

// @desc Casting to **(int)** truncates toward zero, while **Math.round()** rounds to the nearest integer. Compare both.

public class MathOps7 {

    public static String roundBoth(double val) {
        int cast = (int) val;
        long rounded = Math.round(val);
        return cast + " " + rounded;
    }

    public static void main(String[] args) {
        System.out.println(roundBoth(3.7));
        System.out.println(roundBoth(3.2));
        System.out.println(roundBoth(-2.8));
        System.out.println(roundBoth(-2.3));
        System.out.println(roundBoth(0.5));
        System.out.println(roundBoth(4.0));
        System.out.println(roundBoth(-0.5));
    }
}
