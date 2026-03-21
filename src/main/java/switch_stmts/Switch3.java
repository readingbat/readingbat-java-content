package switch_stmts;

// @desc Multiple case labels can fall through to the same return. Trace which group of months each input belongs to.

public class Switch3 {

    public static String season(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {
        System.out.println(season(1));
        System.out.println(season(4));
        System.out.println(season(7));
        System.out.println(season(10));
        System.out.println(season(12));
        System.out.println(season(0));
        System.out.println(season(6));
    }
}
