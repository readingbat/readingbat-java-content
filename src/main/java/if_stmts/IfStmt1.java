package if_stmts;

// @desc An **if** statement only runs its code block when the condition is **true**.

public class IfStmt1 {

    public static int ifIt(int x) {
        int retval;

        if (x > 10)
            retval = x;
        else
            retval = 3;

        return retval;
    }

    public static void main(String[] args) {
        System.out.println(ifIt(5));
        System.out.println(ifIt(15));
        System.out.println(ifIt(0));
        System.out.println(ifIt(10));
        System.out.println(ifIt(13));
        System.out.println(ifIt(20));
        System.out.println(ifIt(3));
    }
}