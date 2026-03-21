package if_stmts;

// @desc The inner **if** only runs when the outer **if** is **true** — trace both conditions.

public class IfStmt5 {

    public static int ifIt(int x, int y) {
        int retval;

        if (x > 5) {
            if (y > 5)
                retval = x + y;
            else
                retval = x;
        } else {
            retval = y;
        }

        return retval;
    }

    public static void main(String[] args) {
        System.out.println(ifIt(10, 10));
        System.out.println(ifIt(10, 3));
        System.out.println(ifIt(3, 10));
        System.out.println(ifIt(3, 3));
        System.out.println(ifIt(6, 6));
        System.out.println(ifIt(6, 1));
        System.out.println(ifIt(1, 6));
    }
}
