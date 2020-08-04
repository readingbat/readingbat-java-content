package string_operations;

// @desc The **.contains** method returns True if a specified substring is found in a string.

public class ContainsOper {

    public static boolean containsOper(String s1, String s2) {
        boolean result = s2.contains(s1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(containsOper("e", "Hello"));
        System.out.println(containsOper("g", "Hello"));
        System.out.println(containsOper("2", "525"));
        System.out.println(containsOper("74", "525"));
        System.out.println(containsOper("gg", "Egg"));
        System.out.println(containsOper("", "World"));
        System.out.println(containsOper(" ", "Hello World"));
        System.out.println(containsOper(" ", "HelloWorld"));
    }
}