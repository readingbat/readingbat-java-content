package string_ops;

// @desc The **.contains()** method returns True if the specified substring is found in a string.

public class Contains {

    public static boolean hasIt(String s1, String s2) {
        boolean result = s2.contains(s1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasIt("e", "Hello"));
        System.out.println(hasIt("g", "Hello"));
        System.out.println(hasIt("2", "525"));
        System.out.println(hasIt("74", "525"));
        System.out.println(hasIt("gg", "Egg"));
        System.out.println(hasIt("", "World"));
        System.out.println(hasIt(" ", "Hello World"));
        System.out.println(hasIt(" ", "HelloWorld"));
    }
}