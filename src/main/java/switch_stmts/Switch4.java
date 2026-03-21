package switch_stmts;

// @desc The switch selects an operation based on the op string. Trace the arithmetic for each call.

public class Switch4 {

    public static int calc(int a, String op, int b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calc(3, "+", 4));
        System.out.println(calc(10, "-", 3));
        System.out.println(calc(5, "*", 6));
        System.out.println(calc(20, "/", 4));
        System.out.println(calc(7, "+", 0));
        System.out.println(calc(0, "*", 100));
        System.out.println(calc(8, "?", 2));
    }
}
