package warmup1;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

public class IntToString {
    public static String[] intToString(int[] numbers) {
        String[] result = new String[numbers.length / 2];
        for (int i = 0; i < numbers.length / 2; i++) {
            result[i] = "" + numbers[i * 2] + numbers[i * 2 + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        arrayPrint(intToString(new int[]{1, 2, 3, 4}));
        arrayPrint(intToString(new int[]{10, 20, 35, 43}));
        arrayPrint(intToString(new int[]{12, 42}));
        arrayPrint(intToString(new int[]{1, 2, 3, 4, 100, 1000}));
        arrayPrint(intToString(new int[]{21, 21, 32, 40}));
        arrayPrint(intToString(new int[]{}));
    }
}