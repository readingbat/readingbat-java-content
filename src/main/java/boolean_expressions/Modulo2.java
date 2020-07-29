// @desc **% 2**" is an easy way of testing if a number is odd or even.
package boolean_expressions;

public class Modulo2 {
    public static boolean Modulo2(int num) {
        int result = num % 2;
        return result == 0;
    }


    public static void main(String[] args) {
        System.out.println(Modulo2(9));
        System.out.println(Modulo2(13));
        System.out.println(Modulo2(10));
        System.out.println(Modulo2(31));
        System.out.println(Modulo2(8));
    }
}