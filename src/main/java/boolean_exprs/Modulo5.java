package boolean_exprs;

// @desc **% 10** always gives you the last digit of a number.

public class Modulo5 {

    public static int mod(int num) {
        int result = num % 10;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mod(47));
        System.out.println(mod(123));
        System.out.println(mod(90));
        System.out.println(mod(5));
        System.out.println(mod(1001));
        System.out.println(mod(256));
        System.out.println(mod(30));
    }
}
