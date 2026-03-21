package boolean_exprs;

// @desc **% 2** gives **0** for even numbers and **1** for odd numbers.

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