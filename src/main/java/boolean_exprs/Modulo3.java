package boolean_exprs;

// @desc **%2** is an easy way of testing if a number is odd or even.

public class Modulo3 {

    public static boolean mod(int num) {
        int result = num % 2;
        return result == 1;
    }

    public static void main(String[] args) {
        System.out.println(mod(9));
        System.out.println(mod(13));
        System.out.println(mod(10));
        System.out.println(mod(31));
        System.out.println(mod(8));
    }
}