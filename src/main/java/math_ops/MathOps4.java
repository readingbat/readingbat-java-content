package math_ops;

// @desc The distance between two numbers is **Math.abs(a - b)**. Order doesn't matter — distance is always positive.

public class MathOps4 {

    public static int distance(int a, int b) {
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        System.out.println(distance(3, 7));
        System.out.println(distance(7, 3));
        System.out.println(distance(-2, 5));
        System.out.println(distance(0, 0));
        System.out.println(distance(-3, -8));
        System.out.println(distance(10, 10));
        System.out.println(distance(-5, 5));
    }
}
