package arrays;

// @desc Sum all elements, then divide by the array length — remember this is **integer division**.

public class ArrayAvg1 {

    public static int arrayAvg(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(arrayAvg(new int[]{2, 4, 6}));
        System.out.println(arrayAvg(new int[]{10}));
        System.out.println(arrayAvg(new int[]{1, 2, 3, 4}));
        System.out.println(arrayAvg(new int[]{7, 7, 7}));
        System.out.println(arrayAvg(new int[]{0, 0, 0, 0}));
        System.out.println(arrayAvg(new int[]{1, 2}));
    }
}
