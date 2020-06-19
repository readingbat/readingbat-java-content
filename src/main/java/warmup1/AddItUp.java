package warmup1;

public class AddItUp {
    public static int addItUp(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(addItUp(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(addItUp(new int[]{1, 6, 3, 7}));
        System.out.println(addItUp(new int[]{0}));
        System.out.println(addItUp(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}