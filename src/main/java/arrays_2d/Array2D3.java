package arrays_2d;

// @desc The main diagonal contains elements where the row index equals the column index — trace which elements are included.

public class Array2D3 {

    public static int sumDiagonal(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++)
            sum += grid[i][i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDiagonal(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(sumDiagonal(new int[][]{{1, 0, 0}, {0, 2, 0}, {0, 0, 3}}));
        System.out.println(sumDiagonal(new int[][]{{5}}));
        System.out.println(sumDiagonal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(sumDiagonal(new int[][]{{10, 0}, {0, 20}}));
        System.out.println(sumDiagonal(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }
}
