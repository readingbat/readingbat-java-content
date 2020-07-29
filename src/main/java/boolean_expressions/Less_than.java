// @desc Determine if one value is less than another with the **<** operator.
package boolean_expressions;

public class Less_than {
    public static boolean Less_than(int val1, int val2) {
        boolean result = val1 < val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Less_than(4, 6));
        System.out.println(Less_than(8, 12));
        System.out.println(Less_than(19, 19));
        System.out.println(Less_than(12, 8));
        System.out.println(Less_than(11, 28));
    }
}