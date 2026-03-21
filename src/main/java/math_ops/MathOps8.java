package math_ops;

// @desc Compute base raised to the exponent using a loop — multiply base by itself exponent times. Watch the edge cases.

public class MathOps8 {

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(5, 2));
        System.out.println(power(3, 0));
        System.out.println(power(10, 1));
        System.out.println(power(2, 10));
        System.out.println(power(1, 100));
        System.out.println(power(7, 3));
    }
}
