package if_stmts;

public class IfStmt3 {

    public static int ifIt(int x, boolean y) {
        if (x > 10 && y)
            return x + 10;
        else
            return x;
    }

    public static void main(String[] args) {
        System.out.println(ifIt(15, true));
        System.out.println(ifIt(15, false));
        System.out.println(ifIt(0, true));
        System.out.println(ifIt(10, true));
        System.out.println(ifIt(13, false));
        System.out.println(ifIt(20, true));
        System.out.println(ifIt(3, false));
    }
}