package while_loops;

// @desc Each iteration halves the number using integer division — count how many steps it takes to reach 1.

public class WhileLoop7 {

    public static int halvingSteps(int n) {
        int count = 0;

        while (n > 1) {
            n /= 2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(halvingSteps(16));
        System.out.println(halvingSteps(1));
        System.out.println(halvingSteps(2));
        System.out.println(halvingSteps(100));
        System.out.println(halvingSteps(7));
        System.out.println(halvingSteps(64));
        System.out.println(halvingSteps(3));
    }
}
