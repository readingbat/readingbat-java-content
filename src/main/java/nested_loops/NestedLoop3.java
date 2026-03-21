package nested_loops;

// @desc Compare every element in array a against every element in array b — return true as soon as a match is found.

public class NestedLoop3 {

    public static boolean hasCommon(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j])
                    return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasCommon(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(hasCommon(new int[]{1, 2, 3}, new int[]{3, 4, 5}));
        System.out.println(hasCommon(new int[]{7}, new int[]{7}));
        System.out.println(hasCommon(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(hasCommon(new int[]{10, 20, 30}, new int[]{5, 10, 15}));
        System.out.println(hasCommon(new int[]{}, new int[]{1, 2, 3}));
        System.out.println(hasCommon(new int[]{1, 2, 3}, new int[]{}));
    }
}
