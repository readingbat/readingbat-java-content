package warmup1;

// @desc The loop breaks when it reaches the halfway point — trace where that cutoff falls.

public class FirstHalf {

    public static int firstHalf(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length / 2)
                break;
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(firstHalf(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(firstHalf(new int[]{1, 6, 3, 7}));
        System.out.println(firstHalf(new int[]{0}));
        System.out.println(firstHalf(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(firstHalf(new int[]{10, 3, 58, 4}));
        System.out.println(firstHalf(new int[]{1, 2, 3, 8}));
    }
}