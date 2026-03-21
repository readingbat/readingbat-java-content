package arrays;

// @desc Start with the first element as the max, then compare each remaining element to find the largest.

public class ArrayMax1 {

    public static int arrayMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(arrayMax(new int[]{1, 3, 2}));
        System.out.println(arrayMax(new int[]{-5, -1, -3}));
        System.out.println(arrayMax(new int[]{42}));
        System.out.println(arrayMax(new int[]{10, 20, 30, 5}));
        System.out.println(arrayMax(new int[]{7, 7, 7}));
        System.out.println(arrayMax(new int[]{99, 1, 50, 98}));
    }
}
