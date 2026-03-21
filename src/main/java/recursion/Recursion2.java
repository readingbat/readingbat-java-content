package recursion;

// @desc Follow each recursive call to the base case — the last digit is extracted with **% 10** and the remaining digits with **/ 10**.

public class Recursion2 {

    public static int sumDigits(int n) {
        if (n < 10)
            return n;
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(1001));
        System.out.println(sumDigits(5432));
    }
}
