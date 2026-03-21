package nested_loops;

// @desc Multiply every element of array a by every element of array b, then sum all the products together.

public class NestedLoop5 {

    public static int productSum(int[] a, int[] b) {
        int sum = 0;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                sum += a[i] * b[j];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(productSum(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(productSum(new int[]{1}, new int[]{1}));
        System.out.println(productSum(new int[]{2, 3}, new int[]{4, 5}));
        System.out.println(productSum(new int[]{0, 1}, new int[]{5, 10}));
        System.out.println(productSum(new int[]{1, 2, 3}, new int[]{1, 1, 1}));
        System.out.println(productSum(new int[]{10}, new int[]{1, 2, 3}));
        System.out.println(productSum(new int[]{-1, 2}, new int[]{3, -4}));
    }
}
