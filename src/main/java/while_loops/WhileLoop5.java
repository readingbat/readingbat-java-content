package while_loops;

// @desc The loop adds elements until it hits a negative number — trace which elements get included in the sum.

public class WhileLoop5 {

    public static int sumUntilNeg(int[] nums) {
        int sum = 0;
        int i = 0;

        while (i < nums.length && nums[i] >= 0) {
            sum += nums[i];
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUntilNeg(new int[]{3, 5, 2, -1, 8}));
        System.out.println(sumUntilNeg(new int[]{-4, 1, 2}));
        System.out.println(sumUntilNeg(new int[]{10, 20, 30}));
        System.out.println(sumUntilNeg(new int[]{}));
        System.out.println(sumUntilNeg(new int[]{7}));
        System.out.println(sumUntilNeg(new int[]{1, 2, 3, -5, 4, 5}));
    }
}
