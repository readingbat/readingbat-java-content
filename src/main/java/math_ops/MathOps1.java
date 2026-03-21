package math_ops;

// @desc **Math.max()** returns the larger of two values. Trace what happens with negatives and equal values.

public class MathOps1 {

    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(maxOf(3, 7));
        System.out.println(maxOf(10, 2));
        System.out.println(maxOf(-1, -5));
        System.out.println(maxOf(0, 0));
        System.out.println(maxOf(-3, 3));
        System.out.println(maxOf(100, 99));
        System.out.println(maxOf(-10, 0));
    }
}
