package recursion;

// @desc Trace the call stack — the helper adds the element at the current index and then recurses with index + 1.

public class Recursion8 {

    public static int sumArray(int[] arr) {
        return sumHelper(arr, 0);
    }

    public static int sumHelper(int[] arr, int index) {
        if (index >= arr.length)
            return 0;
        return arr[index] + sumHelper(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3}));
        System.out.println(sumArray(new int[]{10, 20, 30, 40}));
        System.out.println(sumArray(new int[]{5}));
        System.out.println(sumArray(new int[]{}));
        System.out.println(sumArray(new int[]{-1, 1, -1, 1}));
        System.out.println(sumArray(new int[]{100, 200, 300}));
        System.out.println(sumArray(new int[]{7, 7, 7, 7, 7}));
    }
}
