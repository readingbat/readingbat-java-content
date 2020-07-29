// @desc Determine if two value are not equal with the **!=** operator.
package boolean_exprs;

public class NotEqual {
    public static boolean compare(int val1, int val2) {
        boolean result = val1 != val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compare(9, 9));
        System.out.println(compare(22, 22));
        System.out.println(compare(8, 7));
        System.out.println(compare(12, 24));
        System.out.println(compare(6, 4));
    }
}