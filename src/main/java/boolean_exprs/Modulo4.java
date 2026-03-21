package boolean_exprs;

// @desc **% 3** gives the remainder when dividing by 3 — a remainder of 0 means evenly divisible.

public class Modulo4 {

    public static boolean mod(int num) {
        int result = num % 3;
        return result == 0;
    }

    public static void main(String[] args) {
        System.out.println(mod(9));
        System.out.println(mod(10));
        System.out.println(mod(12));
        System.out.println(mod(7));
        System.out.println(mod(3));
        System.out.println(mod(1));
        System.out.println(mod(15));
    }
}
