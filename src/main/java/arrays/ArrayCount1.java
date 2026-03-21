package arrays;

// @desc Check each element against the threshold — count how many are strictly greater.

public class ArrayCount1 {

    public static int countAbove(int[] nums, int threshold) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > threshold)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAbove(new int[]{1, 5, 3, 7, 2}, 3));
        System.out.println(countAbove(new int[]{10, 20, 30}, 25));
        System.out.println(countAbove(new int[]{}, 5));
        System.out.println(countAbove(new int[]{1, 2, 3}, 0));
        System.out.println(countAbove(new int[]{4}, 4));
        System.out.println(countAbove(new int[]{100, 200, 300}, 99));
    }
}
