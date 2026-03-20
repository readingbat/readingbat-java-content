package warmup1;

// @desc Adds the sum of every other number in an array, starting with the first one

public class EveryOther2 {

    public static int everyOther2(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            if (i % 2 == 0)
                sum += numbers[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(everyOther2(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(everyOther2(new int[]{1, 6, 3, 7}));
        System.out.println(everyOther2(new int[]{0}));
        System.out.println(everyOther2(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(everyOther2(new int[]{10, 3, 58, 4}));
        System.out.println(everyOther2(new int[]{1, 2, 3, 8}));
    }
}