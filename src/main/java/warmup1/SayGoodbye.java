package warmup1;

// @desc Given a string name, e.g. "Bob", return a greeting of the form "Goodbye Bob!".

public class SayGoodbye {

    public static String sayGoodBye(String name) {
        return "Goodbye " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(sayGoodBye("person"));
        System.out.println(sayGoodBye("everyone"));
        System.out.println(sayGoodBye("5"));
        System.out.println(sayGoodBye("alpha"));
        System.out.println(sayGoodBye("rain"));
        System.out.println(sayGoodBye("school"));
        System.out.println(sayGoodBye(""));
        System.out.println(sayGoodBye("Matt"));
    }
}