package arrays;

// @desc Start with the first element as the min, then compare each remaining element to find the smallest.

public class ArrayMin1 {

    public static int arrayMin(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(arrayMin(new int[]{3, 1, 2}));
        System.out.println(arrayMin(new int[]{-5, -1, -3}));
        System.out.println(arrayMin(new int[]{42}));
        System.out.println(arrayMin(new int[]{10, 20, 5, 30}));
        System.out.println(arrayMin(new int[]{7, 7, 7}));
        System.out.println(arrayMin(new int[]{50, 99, 1, 98}));
    }
}
