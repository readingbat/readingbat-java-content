package warmup1;

// @desc Returns a string with the first letter of each word capitalized

public class UpperLower {

    public static String upperLower(String a) {
        String result = a.toUpperCase() + a.toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(upperLower("Hello"));
        System.out.println(upperLower("World"));
        System.out.println(upperLower("Hi!"));
        System.out.println(upperLower(""));
        System.out.println(upperLower(" "));
        System.out.println(upperLower("Ok?"));
    }
}