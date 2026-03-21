package if_stmts;

// @desc The **? :** operator is a shorthand **if/else** — the condition picks which value to return.

public class IfStmt7 {

    public static int ifIt(int x) {
        int retval = (x > 10) ? x * 2 : x + 1;
        return retval;
    }

    public static void main(String[] args) {
        System.out.println(ifIt(5));
        System.out.println(ifIt(15));
        System.out.println(ifIt(10));
        System.out.println(ifIt(11));
        System.out.println(ifIt(0));
        System.out.println(ifIt(20));
        System.out.println(ifIt(-3));
    }
}
