package recursion;

// @desc Follow each recursive call to the base case — fib(n) adds the results of fib(n-1) and fib(n-2).

public class Recursion6 {

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(5));
        System.out.println(fib(7));
        System.out.println(fib(10));
    }
}
