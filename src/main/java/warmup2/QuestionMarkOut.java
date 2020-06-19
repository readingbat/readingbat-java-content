package warmup2;

public class QuestionMarkOut {
    public static String qMarkOut(String str) {
        String result = "";
        boolean inQuestion = false;
        boolean chopable = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '?') {
                if (!inQuestion && chopable && result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                    chopable = false;
                }
                inQuestion = true;
            } else {
                if (!inQuestion) {
                    result += str.charAt(i);
                    chopable = true;
                }
                inQuestion = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(qMarkOut("aaa?bbb"));
        System.out.println(qMarkOut("bb?ba"));
        System.out.println(qMarkOut("aa"));
        System.out.println(qMarkOut("a?"));
        System.out.println(qMarkOut("?"));
        System.out.println(qMarkOut("abc?d?ef"));
        System.out.println(qMarkOut("hel?l?llo"));
        System.out.println(qMarkOut("H??????ihi"));
        System.out.println(qMarkOut("?"));
        System.out.println(qMarkOut(""));
        System.out.println(qMarkOut("a"));
    }
}