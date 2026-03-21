package boolean_exprs;

// @desc The **%** operator returns the remainder after division. For example, **7 % 3** equals **1**.

public class Modulo1 {

    public static int mod(int num, int mod) {
        int result = num % mod;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mod(9, 2));
        System.out.println(mod(13, 2));
        System.out.println(mod(10, 5));
        System.out.println(mod(30, 4));
        System.out.println(mod(8, 1));
    }
}