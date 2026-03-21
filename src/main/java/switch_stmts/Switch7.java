package switch_stmts;

// @desc Dividing the score by 10 maps it to a range. Trace the integer division and which case it matches.

public class Switch7 {

    public static String scoreToGrade(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(scoreToGrade(95));
        System.out.println(scoreToGrade(100));
        System.out.println(scoreToGrade(85));
        System.out.println(scoreToGrade(72));
        System.out.println(scoreToGrade(60));
        System.out.println(scoreToGrade(45));
        System.out.println(scoreToGrade(89));
    }
}
