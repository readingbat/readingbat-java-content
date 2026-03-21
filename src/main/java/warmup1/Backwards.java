package warmup1;

// @desc The loop starts at the end of the array and works backward — trace which indices are visited.

public class Backwards {

    public static int backwards(int[] numbers) {
        int sum = 0;

        for (int i = numbers.length - 1; i > 0; i--)
            sum += numbers[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(backwards(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(backwards(new int[]{1, 6, 3, 7}));
        System.out.println(backwards(new int[]{0}));
        System.out.println(backwards(new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(backwards(new int[]{10, 3, 58, 4}));
        System.out.println(backwards(new int[]{1, 2, 3, 8}));
    }
}