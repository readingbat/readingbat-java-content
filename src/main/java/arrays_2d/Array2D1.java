package arrays_2d;

// @desc Trace through each row and column — the nested loops visit every element and add it to the running total.

public class Array2D1 {

    public static int sumAll(int[][] grid) {
        int sum = 0;

        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[r].length; c++)
                sum += grid[r][c];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumAll(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(sumAll(new int[][]{{1, 1, 1}, {1, 1, 1}}));
        System.out.println(sumAll(new int[][]{{10}}));
        System.out.println(sumAll(new int[][]{{5, 5}, {5, 5}, {5, 5}}));
        System.out.println(sumAll(new int[][]{{0, 0}, {0, 0}}));
        System.out.println(sumAll(new int[][]{{-1, 2}, {3, -4}}));
        System.out.println(sumAll(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
