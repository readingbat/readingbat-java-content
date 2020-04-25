package warmup1;

public class JoinEnds {

    public static String joinEnds(String str) {
        if (str.length() < 2)
            return str;

        String b = str.substring(0, 1);
        String e = str.substring(str.length() - 1, str.length());

        return e + b;
    }

    public static void main(String[] args) {
        System.out.println(joinEnds("Blue zebra"));
        System.out.println(joinEnds("Tree"));
        System.out.println(joinEnds("Re"));
        System.out.println(joinEnds("p"));
        System.out.println(joinEnds(""));
    }
}
