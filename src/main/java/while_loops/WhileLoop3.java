package while_loops;

// @desc Each iteration appends the character to the result — track how many times the loop runs.

public class WhileLoop3 {

    public static String repeatChar(char ch, int n) {
        String result = "";
        int i = 0;

        while (i < n) {
            result += ch;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatChar('x', 3));
        System.out.println(repeatChar('a', 5));
        System.out.println(repeatChar('z', 1));
        System.out.println(repeatChar('!', 0));
        System.out.println(repeatChar('o', 4));
        System.out.println(repeatChar('*', 6));
    }
}
