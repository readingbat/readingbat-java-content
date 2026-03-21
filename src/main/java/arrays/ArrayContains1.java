package arrays;

// @desc Check each element one at a time — return **true** as soon as you find a match.

public class ArrayContains1 {

    public static boolean contains(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains(new int[]{1, 2, 3}, 2));
        System.out.println(contains(new int[]{1, 2, 3}, 5));
        System.out.println(contains(new int[]{}, 1));
        System.out.println(contains(new int[]{7}, 7));
        System.out.println(contains(new int[]{7}, 3));
        System.out.println(contains(new int[]{10, 20, 30, 40}, 30));
    }
}
