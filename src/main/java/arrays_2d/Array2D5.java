package arrays_2d;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

// @desc For each row, add up all the column values — the result array has one sum per row.

public class Array2D5 {

    public static int[] rowSums(int[][] grid) {
        int[] sums = new int[grid.length];

        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[r].length; c++)
                sums[r] += grid[r][c];

        return sums;
    }

    public static void main(String[] args) {
        arrayPrint(rowSums(new int[][]{{1, 2}, {3, 4}}));
        arrayPrint(rowSums(new int[][]{{1, 1, 1}, {2, 2, 2}}));
        arrayPrint(rowSums(new int[][]{{10}}));
        arrayPrint(rowSums(new int[][]{{5, 5}, {5, 5}, {5, 5}}));
        arrayPrint(rowSums(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        arrayPrint(rowSums(new int[][]{{0, 0}, {0, 0}}));
    }
}
