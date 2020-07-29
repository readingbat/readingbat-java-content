package if_stmts;

public class IfStmt4 {

    public static int ifIt(boolean x, int y, int z) {
        if (x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println(ifIt(true, 3, 1));
        System.out.println(ifIt(false, 3, 1));
        System.out.println(ifIt(true, 10, 3));
        System.out.println(ifIt(false, 11, 3));
        System.out.println(ifIt(false, 51, 32));
        System.out.println(ifIt(true, 1, 0));

    }
}