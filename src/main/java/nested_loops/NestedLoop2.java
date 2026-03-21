package nested_loops;

// @desc Build a triangle of stars row by row — row 1 has one star, row 2 has two, and so on up to n.

public class NestedLoop2 {

    public static String triangle(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                result += "*";
            if (i < n)
                result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(triangle(1));
        System.out.println(triangle(2));
        System.out.println(triangle(3));
        System.out.println(triangle(4));
        System.out.println(triangle(5));
        System.out.println(triangle(0));
    }
}
