package while_loops;

// @desc Dividing by 10 removes the last digit — count how many times this happens before reaching 0.

public class WhileLoop2 {

    public static int countDigits(int n) {
        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(123));
        System.out.println(countDigits(7));
        System.out.println(countDigits(0));
        System.out.println(countDigits(99999));
        System.out.println(countDigits(10));
        System.out.println(countDigits(1000));
    }
}
