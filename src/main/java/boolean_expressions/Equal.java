// @desc Determine if two value are equal with the "**==**" operator. *Notice the 2 "=" characters.
package boolean_expressions;

public class Equal {
    public static boolean Equal(int val1, int val2) {
        boolean result = val1 == val2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Equal(6, 6));
        System.out.println(Equal(12, 12));
        System.out.println(Equal(8, 7));
        System.out.println(Equal(12, 24));
        System.out.println(Equal(7, 7));
    }
}