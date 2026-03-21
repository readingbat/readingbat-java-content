package arrays;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

// @desc Build a new array by copying elements from the end to the beginning.

public class ArrayReverse1 {

    public static int[] arrayReverse(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            result[i] = nums[nums.length - 1 - i];

        return result;
    }

    public static void main(String[] args) {
        arrayPrint(arrayReverse(new int[]{1, 2, 3}));
        arrayPrint(arrayReverse(new int[]{5}));
        arrayPrint(arrayReverse(new int[]{10, 20, 30, 40}));
        arrayPrint(arrayReverse(new int[]{}));
        arrayPrint(arrayReverse(new int[]{7, 7, 7}));
        arrayPrint(arrayReverse(new int[]{1, 2}));
    }
}
