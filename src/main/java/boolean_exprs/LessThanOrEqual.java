package boolean_exprs;

// @desc Determine if one value is greater than or equal to another with the **<=** operator. Notice the **=** comes after the **<**.

public class LessThanOrEqual {

    public static boolean compare(int val1, int val2) {
        boolean result = val1 <= val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(6, 4));
        System.out.println(compare(12, 12));
        System.out.println(compare(8, 8));
        System.out.println(compare(12, 24));
        System.out.println(compare(7, 2));
    }
}