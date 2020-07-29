package for_loops;

// @desc **+= 2** increments by 2

public class ForLoop1 {

    public static int LoopIt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LoopIt("hello"));
        System.out.println(LoopIt("world"));
        System.out.println(LoopIt("apples"));
        System.out.println(LoopIt(""));
        System.out.println(LoopIt("a"));
        System.out.println(LoopIt("oof"));
    }
}