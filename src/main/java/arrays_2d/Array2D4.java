package arrays_2d;

// @desc Trace through every element — keep track of the largest value seen so far as each element is visited.

public class Array2D4 {

    public static int findMax(int[][] grid) {
        int max = grid[0][0];

        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[r].length; c++)
                if (grid[r][c] > max)
                    max = grid[r][c];

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(findMax(new int[][]{{10, 5}, {3, 8}}));
        System.out.println(findMax(new int[][]{{-1, -2}, {-3, -4}}));
        System.out.println(findMax(new int[][]{{99}}));
        System.out.println(findMax(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(findMax(new int[][]{{5, 5}, {5, 5}}));
        System.out.println(findMax(new int[][]{{0, 100}, {200, 50}}));
    }
}
