package nested_loops;

// @desc The first row repeats the string n times, the next row n-1 times, and so on. Repetitions are separated by spaces.

public class NestedLoop6 {

    public static String pattern(int n, String s) {
        String result = "";

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (j > 0)
                    result += " ";
                result += s;
            }
            if (i > 1)
                result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pattern(3, "ab"));
        System.out.println(pattern(1, "x"));
        System.out.println(pattern(2, "hi"));
        System.out.println(pattern(4, "*"));
        System.out.println(pattern(3, "go"));
        System.out.println(pattern(0, "ab"));
    }
}
