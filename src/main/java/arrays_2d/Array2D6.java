package arrays_2d;

// @desc Trace through the grid row by row — return **true** as soon as the target is found, or **false** after checking everything.

public class Array2D6 {

    public static boolean contains(int[][] grid, int target) {
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[r].length; c++)
                if (grid[r][c] == target)
                    return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains(new int[][]{{1, 2}, {3, 4}}, 3));
        System.out.println(contains(new int[][]{{1, 2}, {3, 4}}, 5));
        System.out.println(contains(new int[][]{{10, 20, 30}, {40, 50, 60}}, 50));
        System.out.println(contains(new int[][]{{10, 20, 30}, {40, 50, 60}}, 99));
        System.out.println(contains(new int[][]{{7}}, 7));
        System.out.println(contains(new int[][]{{7}}, 0));
        System.out.println(contains(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9));
    }
}
