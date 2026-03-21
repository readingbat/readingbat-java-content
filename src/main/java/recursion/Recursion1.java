package recursion;

// @desc Trace the call stack for **factorial(n)** — each call multiplies n by the result of factorial(n-1) until reaching the base case.

public class Recursion1 {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(10));
    }
}
