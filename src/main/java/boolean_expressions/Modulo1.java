// @desc The "**%**" operator returns the remainder after dividing two numbers. See more details [here](https://blog.mattclemente.com/2019/07/12/modulus-operator-modulo-operation.html).
// """.trimIndent()
package boolean_expressions;

public class Modulo1 {
    public static int Modulo1(int num, int mod) {
        int result = num % mod;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Modulo1(9, 2));
        System.out.println(Modulo1(13, 2));
        System.out.println(Modulo1(10, 5));
        System.out.println(Modulo1(30, 4));
        System.out.println(Modulo1(8, 1));
    }
}