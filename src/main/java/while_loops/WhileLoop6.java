package while_loops;

// @desc Use **% 10** to get the last digit and **/ 10** to remove it — build the reversed number step by step.

public class WhileLoop6 {

    public static int reverseNum(int n) {
        int result = 0;

        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(123));
        System.out.println(reverseNum(5));
        System.out.println(reverseNum(1000));
        System.out.println(reverseNum(987654));
        System.out.println(reverseNum(10));
        System.out.println(reverseNum(111));
    }
}
