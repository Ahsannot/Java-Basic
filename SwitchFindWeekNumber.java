public class SwitchFindWeekNumber {
    public static void main(String[] args) {
        int day = 15; // 1 to 7 are valid days of the week and 15 is invalid
        String dayName = ""; // empty string to store the day name based on the day number provided by the user
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                // break;
        }
        System.out.println("The day is: " + dayName);
    }
}