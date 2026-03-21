package recursion;

// @desc Trace the call stack — each call multiplies the base by the result of power(base, exp-1) until exp reaches 0.

public class Recursion3 {

    public static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 0));
        System.out.println(power(2, 3));
        System.out.println(power(3, 2));
        System.out.println(power(5, 3));
        System.out.println(power(10, 4));
        System.out.println(power(1, 8));
        System.out.println(power(4, 3));
    }
}
