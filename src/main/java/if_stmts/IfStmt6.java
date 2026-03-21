package if_stmts;

// @desc Both conditions must be **true** for the **&&** to be **true** — check each side.

public class IfStmt6 {

    public static int ifIt(int a, int b) {
        int retval;

        if (a > 0 && b > 0)
            retval = a + b;
        else
            retval = 0;

        return retval;
    }

    public static void main(String[] args) {
        System.out.println(ifIt(3, 5));
        System.out.println(ifIt(-1, 5));
        System.out.println(ifIt(3, -2));
        System.out.println(ifIt(-1, -2));
        System.out.println(ifIt(0, 5));
        System.out.println(ifIt(10, 10));
        System.out.println(ifIt(1, 0));
    }
}
