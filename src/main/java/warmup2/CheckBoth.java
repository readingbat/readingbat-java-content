package warmup2;

public class CheckBoth {

    public static boolean checkBoth(int[] vals) {
        boolean gt15 = false;
        boolean lt10 = false;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] > 15)
                gt15 = true;


        for (int i = 0; i < vals.length; i++)
            if (vals[i] < 10)
                lt10 = true;


        return gt15 && lt10;
    }

    public static void main(String[] args) {
        System.out.println(checkBoth(new int[]{16, 4, 5}));
        System.out.println(checkBoth(new int[]{4, 6, 8}));
        System.out.println(checkBoth(new int[]{5}));
        System.out.println(checkBoth(new int[]{6}));
    }
}