package warmup2;

public class Front3 {

    public static String front3(String str) {
        if (str.length() < 3)
            return str + str + str;
        else
            return (str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3));
    }

    public static void main(String[] args) {
        System.out.println(front3("aabbb"));
        System.out.println(front3("baa"));
        System.out.println(front3("abcabc"));
        System.out.println(front3("a"));
        System.out.println(front3(""));
    }
}