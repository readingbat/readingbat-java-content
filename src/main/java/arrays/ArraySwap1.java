package arrays;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

// @desc Swap the first and last elements — use a temporary variable to hold one value during the exchange.

public class ArraySwap1 {

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

    public static void main(String[] args) {
        arrayPrint(swapEnds(new int[]{1, 2, 3}));
        arrayPrint(swapEnds(new int[]{5, 10}));
        arrayPrint(swapEnds(new int[]{7}));
        arrayPrint(swapEnds(new int[]{1, 2, 3, 4, 5}));
        arrayPrint(swapEnds(new int[]{9, 0, 9}));
        arrayPrint(swapEnds(new int[]{100, 200, 300, 400}));
    }
}
