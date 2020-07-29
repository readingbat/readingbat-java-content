package boolean_exprs;

// @desc The [modulo](https://www.java67.com/2014/11/modulo-or-remainder-operator-in-java.html) operator (**%**) returns the remainder after dividing two numbers.

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