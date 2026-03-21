package nested_loops;

// @desc For each character in string a, scan through all of string b and count every match. Add up all the matches.

public class NestedLoop4 {

    public static int countMatches(String a, String b) {
        int total = 0;

        for (int i = 0; i < a.length(); i++)
            for (int j = 0; j < b.length(); j++)
                if (a.charAt(i) == b.charAt(j))
                    total++;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(countMatches("abc", "abc"));
        System.out.println(countMatches("aaa", "aaa"));
        System.out.println(countMatches("abc", "xyz"));
        System.out.println(countMatches("ab", "bba"));
        System.out.println(countMatches("hello", "world"));
        System.out.println(countMatches("", "abc"));
        System.out.println(countMatches("aab", "ab"));
    }
}
