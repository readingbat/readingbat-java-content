package math_ops;

// @desc Clamping forces a value into the range [min, max]. If it's too low, use min; too high, use max.

public class MathOps6 {

    public static int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }

    public static void main(String[] args) {
        System.out.println(clamp(5, 0, 10));
        System.out.println(clamp(-3, 0, 10));
        System.out.println(clamp(15, 0, 10));
        System.out.println(clamp(0, 0, 10));
        System.out.println(clamp(10, 0, 10));
        System.out.println(clamp(50, 1, 100));
        System.out.println(clamp(-20, -10, -1));
    }
}
