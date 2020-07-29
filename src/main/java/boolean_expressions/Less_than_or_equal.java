// @desc Determine if one value is greater than or equal to another with the **<=** operator. *Notice the "=" comes after the "<".
package boolean_expressions;

public class Less_than_or_equal {
    public static boolean Less_than_or_equal(int val1, int val2) {
        boolean result = val1 <= val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Less_than_or_equal(6, 4));
        System.out.println(Less_than_or_equal(12, 12));
        System.out.println(Less_than_or_equal(8, 8));
        System.out.println(Less_than_or_equal(12, 24));
        System.out.println(Less_than_or_equal(7, 2));
    }
}