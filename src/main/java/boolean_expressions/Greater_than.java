// @desc Determine if one value is greater than another with the **>** operator.
package boolean_expressions;

public class Greater_than {
    public static boolean Greater_than(int val1, int val2) {
        boolean result = val1 > val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Greater_than(4, 6));
        System.out.println(Greater_than(8, 12));
        System.out.println(Greater_than(19, 19));
        System.out.println(Greater_than(12, 8));
        System.out.println(Greater_than(11, 28));
    }
}