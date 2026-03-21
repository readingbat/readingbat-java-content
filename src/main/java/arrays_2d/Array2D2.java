package arrays_2d;

// @desc Trace through every element in the grid — increment the count each time the target value is found.

public class Array2D2 {

    public static int countVal(int[][] grid, int target) {
        int count = 0;

        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[r].length; c++)
                if (grid[r][c] == target)
                    count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVal(new int[][]{{1, 2}, {3, 1}}, 1));
        System.out.println(countVal(new int[][]{{5, 5, 5}, {5, 5, 5}}, 5));
        System.out.println(countVal(new int[][]{{1, 2, 3}, {4, 5, 6}}, 7));
        System.out.println(countVal(new int[][]{{3}}, 3));
        System.out.println(countVal(new int[][]{{1, 2}, {2, 1}, {1, 2}}, 2));
        System.out.println(countVal(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0));
    }
}
