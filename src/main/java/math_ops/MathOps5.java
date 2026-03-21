package math_ops;

// @desc Integer division **/** gives the quotient and **%** gives the remainder. Trace both operations for each pair.

public class MathOps5 {

    public static String divAndRem(int a, int b) {
        return a / b + " R " + a % b;
    }

    public static void main(String[] args) {
        System.out.println(divAndRem(10, 3));
        System.out.println(divAndRem(7, 2));
        System.out.println(divAndRem(20, 4));
        System.out.println(divAndRem(1, 5));
        System.out.println(divAndRem(15, 6));
        System.out.println(divAndRem(100, 7));
        System.out.println(divAndRem(9, 9));
    }
}
