package warmup1;

// @desc This is a *description* of **MixString**

public class MixString {

    public static String mixString(String a, String b) {
        String result = "";
        int rem = 0;
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                result += b.substring(i, i + 1);
                result += a.substring(i, i + 1);
                rem = i + 1;
            }
            result += b.substring(rem);
        }
        else {
            for (int i = 0; i < b.length(); i++) {
                result += b.substring(i, i + 1);
                result += a.substring(i, i + 1);
                rem = i + 1;
            }
            result += a.substring(rem);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("Hello", "World"));
        System.out.println(mixString("Comp", "Sci"));
        System.out.println(mixString("Big", "oOf"));
        System.out.println(mixString("a", "fntastic"));
    }
}