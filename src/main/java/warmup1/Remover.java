package warmup1;

public class Remover {

    public static String takeOut(String a, String b) {
        String result = "";
        int len = b.length();

        for (int i = 0; i <= a.length() - len; i++) {
            if (a.substring(i, i + len).equals(b))
                i += len - 1;
            else
                result += a.substring(i, i + 1);
        }

        result += a.substring(a.length() - len + 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(takeOut("Hello", "el"));
        System.out.println(takeOut("World", "o"));
        System.out.println(takeOut("Computational", "a"));
        System.out.println(takeOut("Hi", " "));
        System.out.println(takeOut("!!!!", "!"));
        System.out.println(takeOut("Ok", "o"));
    }
}