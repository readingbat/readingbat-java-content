package switch_stmts;

// @desc Map each integer 1 through 5 to a letter grade using a switch statement. Any other value returns "?".

public class Switch1 {

    public static String toGrade(int num) {
        switch (num) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "F";
            default:
                return "?";
        }
    }

    public static void main(String[] args) {
        System.out.println(toGrade(1));
        System.out.println(toGrade(2));
        System.out.println(toGrade(3));
        System.out.println(toGrade(4));
        System.out.println(toGrade(5));
        System.out.println(toGrade(0));
        System.out.println(toGrade(6));
    }
}
