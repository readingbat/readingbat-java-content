package for_loops;

// @desc A **for** loop repeats its body for each value of the loop variable — trace what happens on each step.

public class ForLoop1 {

    public static int loopIt(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("hello"));
        System.out.println(loopIt("world"));
        System.out.println(loopIt("apples"));
        System.out.println(loopIt(""));
        System.out.println(loopIt("a"));
        System.out.println(loopIt("oof"));
    }
}