package switch_stmts;

// @desc Each day number from 1 to 7 maps to a day name. Trace which case the switch selects for the given input.

public class Switch2 {

    public static String dayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {
        System.out.println(dayName(1));
        System.out.println(dayName(3));
        System.out.println(dayName(5));
        System.out.println(dayName(7));
        System.out.println(dayName(0));
        System.out.println(dayName(6));
    }
}
