package for_loops;

// @desc Track the accumulator variable as it grows with each iteration.

public class ForLoop8 {

    public static int loopIt(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(loopIt(new int[]{1, 2, 3}));
        System.out.println(loopIt(new int[]{10, 20, 30}));
        System.out.println(loopIt(new int[]{5}));
        System.out.println(loopIt(new int[]{}));
        System.out.println(loopIt(new int[]{-1, 1, -1, 1}));
        System.out.println(loopIt(new int[]{100, 200, 300, 400}));
        System.out.println(loopIt(new int[]{7, 3}));
    }
}
