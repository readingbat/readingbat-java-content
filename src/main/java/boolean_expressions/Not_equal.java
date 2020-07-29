// @desc Determine if two value are not equal with the "**!=**" operator.
package boolean_expressions;

public class Not_equal {
    public static boolean Not_equal(int val1, int val2) {
        boolean result = val1 != val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Not_equal(9, 9));
        System.out.println(Not_equal(22, 22));
        System.out.println(Not_equal(8, 7));
        System.out.println(Not_equal(12, 24));
        System.out.println(Not_equal(6, 4));
    }
}