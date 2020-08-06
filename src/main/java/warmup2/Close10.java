package warmup2;

public class Close10 {
    public static int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b))
            return b;
        else if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(close10(3, 3));
        System.out.println(close10(8, 10));
        System.out.println(close10(10, 21));
        System.out.println(close10(40, 2));
        System.out.println(close10(4, 2));
    }
}