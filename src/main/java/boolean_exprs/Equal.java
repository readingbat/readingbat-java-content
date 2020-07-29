package boolean_exprs;

// @desc Determine if two value are equal with the **==** operator. Notice the 2 **=** characters.

public class Equal {

    public static boolean compare(int val1, int val2) {
        boolean result = val1 == val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(6, 6));
        System.out.println(compare(12, 12));
        System.out.println(compare(8, 7));
        System.out.println(compare(12, 24));
        System.out.println(compare(7, 7));
    }
}