package for_loops;

// @desc The loop starts at the last index and works backward — trace which character is added first.

public class ForLoop6 {

    public static String loopIt(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(loopIt("hello"));
        System.out.println(loopIt("abc"));
        System.out.println(loopIt("java"));
        System.out.println(loopIt("a"));
        System.out.println(loopIt("noon"));
        System.out.println(loopIt("12345"));
    }
}
