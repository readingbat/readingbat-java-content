package boolean_exprs;

// @desc Determine if one value is less than another with the **<** operator.

public class LessThan {
    public static boolean compare(int val1, int val2) {
        boolean result = val1 < val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(4, 6));
        System.out.println(compare(8, 12));
        System.out.println(compare(19, 19));
        System.out.println(compare(12, 8));
        System.out.println(compare(11, 28));
    }
}