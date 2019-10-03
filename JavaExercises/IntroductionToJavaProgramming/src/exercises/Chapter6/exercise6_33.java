package exercises.Chapter6;

public class exercise6_33 {
    /** Current date and time */
    public static void main(String[] args) {
        System.out.printf("Current date and time is %s %s", currentDate(), currentTime());
    }

    /** Compute and print time */
    public static String currentTime() {
        long millis = System.currentTimeMillis() + 6 * 60 * 60 * 1000;
        int seconds = (int)(millis / 1000);
        int second = seconds % 60;
        int minutes = seconds / 60;
        int minute = (minutes % 60);
        int hours = minutes / 60;
        int hour = hours % 24;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /** Compute and print date */
    public static String currentDate() {
        long millis = System.currentTimeMillis() + 30 * 60 * 60 * 1000;
        int year = 1970;
        int month = 1;
        int days = (int)(millis / (24 * 60 * 60 * 1000));
        while (days > (isLeapYear(year) ? 366 : 365)) {
            days -= isLeapYear(year++) ? 366 : 365;
        }
        while (days > getNumberOfDaysInMonth(year, month)) {
            days -= getNumberOfDaysInMonth(year, month++);
        }
        return String.format("%s %d, %d", getMonthName(month), days, year);
    }

    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 2) return isLeapYear(year) ? 29 : 28;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) return 31;

        if (month == 4 || month == 6 || month == 9 || month ==11) return 30;

        return 0;   // If month is incorrect
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        return monthName;
    }
}
