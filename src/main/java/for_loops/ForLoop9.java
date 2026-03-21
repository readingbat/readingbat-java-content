package for_loops;

// @desc The outer loop controls the rows, the inner loop controls how many numbers appear in each row.

public class ForLoop9 {

    public static String loopIt(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result += j;
            }
            if (i < n)
                result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt(4));
        System.out.println(loopIt(1));
        System.out.println(loopIt(2));
        System.out.println(loopIt(3));
        System.out.println(loopIt(5));
        System.out.println(loopIt(6));
    }
}
