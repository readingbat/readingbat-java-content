package math_ops;

// @desc **Math.min()** returns the smaller of two values. Think carefully about negative numbers.

public class MathOps2 {

    public static int minOf(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        System.out.println(minOf(3, 7));
        System.out.println(minOf(10, 2));
        System.out.println(minOf(-1, -5));
        System.out.println(minOf(0, 0));
        System.out.println(minOf(-3, 3));
        System.out.println(minOf(100, 99));
        System.out.println(minOf(-10, 0));
    }
}
