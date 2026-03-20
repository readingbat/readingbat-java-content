package warmup1;

// @desc Given an array of ints, return the sum of the even numbers in the array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public class OnlyEven {

    public static int onlyEven(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 == 0)
                sum += numbers[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(onlyEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(onlyEven(new int[]{1, 6, 3, 7}));
        System.out.println(onlyEven(new int[]{0}));
        System.out.println(onlyEven(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(onlyEven(new int[]{10, 3, 58, 4}));
        System.out.println(onlyEven(new int[]{1, 2, 3, 8}));
    }
}