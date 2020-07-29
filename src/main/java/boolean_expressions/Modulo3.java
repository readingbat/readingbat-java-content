// @desc **% 2**" is an easy way of testing if a number is odd or even.
package boolean_expressions;

public class Modulo3 {
    public static boolean Modulo3(int num) {
        int result = num % 2;
        return result == 1;
    }

    public static void main(String[] args) {
        System.out.println(Modulo3(9));
        System.out.println(Modulo3(13));
        System.out.println(Modulo3(10));
        System.out.println(Modulo3(31));
        System.out.println(Modulo3(8));
    }
}