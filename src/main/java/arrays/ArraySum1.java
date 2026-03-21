package arrays;

// @desc Walk through the array and add each element to a running total.

public class ArraySum1 {

    public static int arraySum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1, 2, 3}));
        System.out.println(arraySum(new int[]{10, -5, 3}));
        System.out.println(arraySum(new int[]{}));
        System.out.println(arraySum(new int[]{7}));
        System.out.println(arraySum(new int[]{0, 0, 0}));
        System.out.println(arraySum(new int[]{100, 200, 300, 400}));
    }
}
