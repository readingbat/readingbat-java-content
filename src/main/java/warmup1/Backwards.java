package warmup1;

public class Backwards {

    public static int backwards(int[] numbers) {
        int count = 0;

        for (int i = numbers.length; i > 0; i--)
            count += numbers[i];

        return count;
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