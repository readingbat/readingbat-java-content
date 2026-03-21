package math_ops;

// @desc **Math.abs()** returns the absolute value — the distance from zero. Negative inputs become positive.

public class MathOps3 {

    public static int absVal(int n) {
        return Math.abs(n);
    }

    public static void main(String[] args) {
        System.out.println(absVal(5));
        System.out.println(absVal(-5));
        System.out.println(absVal(0));
        System.out.println(absVal(-100));
        System.out.println(absVal(42));
        System.out.println(absVal(-1));
        System.out.println(absVal(1));
    }
}
