package nested_loops;

// @desc Count each pair (i, j) where both range from 0 to n and check whether i + j equals the target.

public class NestedLoop1 {

    public static int countPairs(int n, int target) {
        int count = 0;

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                if (i + j == target)
                    count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(3, 4));
        System.out.println(countPairs(3, 0));
        System.out.println(countPairs(3, 6));
        System.out.println(countPairs(5, 5));
        System.out.println(countPairs(2, 2));
        System.out.println(countPairs(4, 3));
        System.out.println(countPairs(0, 0));
    }
}
