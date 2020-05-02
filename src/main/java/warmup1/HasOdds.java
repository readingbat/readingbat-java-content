package warmup1;

import static com.github.pambrose.common.util.ArrayUtils.arrayPrint;

public class HasOdds {

    public static String[] hasOdds(int[] vals) {

        String[] results = new String[vals.length];

        for (int i = 0; i < vals.length; i++)
            if (vals[i] % 2 == 0)
                results[i] = "no";
            else
                results[i] = "yes";

        return results;
    }

    public static void main(String[] args) {
        arrayPrint(hasOdds(new int[]{5, 4, 5}));
        arrayPrint(hasOdds(new int[]{4, 6, 8}));
        arrayPrint(hasOdds(new int[]{5}));
        arrayPrint(hasOdds(new int[]{6}));
    }
}
