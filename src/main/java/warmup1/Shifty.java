package warmup1;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

public class Shifty {

    public static int[] shifty(int[] vals) {

        int[] results = new int[vals.length];

        for (int i = 1; i < vals.length; i++)
            results[i - 1] = vals[i];

        results[results.length - 1] = vals[0];

        return results;
    }

    public static void main(String[] args) {
        arrayPrint(shifty(new int[]{1, 2, 3, 4, 5}));
        arrayPrint(shifty(new int[]{7, 6, 5, 4, 3}));
        arrayPrint(shifty(new int[]{1}));
    }
}
