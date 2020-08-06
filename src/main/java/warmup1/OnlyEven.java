package warmup1;

public class OnlyEven {

    public static int onlyEven(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 == 0)
                count += numbers[i];

        return count;
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