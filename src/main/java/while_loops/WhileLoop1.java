package while_loops;

// @desc Trace the **while** loop — add each value of **n** to the sum before decrementing.

public class WhileLoop1 {

    public static int countdownSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n;
            n--;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countdownSum(5));
        System.out.println(countdownSum(3));
        System.out.println(countdownSum(1));
        System.out.println(countdownSum(0));
        System.out.println(countdownSum(10));
        System.out.println(countdownSum(7));
    }
}
