package exercises.Chapter6;

public class exercise6_16 {
    /** Number of days in a year */
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(numberOfDaysInYear(year) + " days in " + year);
        }
    }

    public static int numberOfDaysInYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
    }
}
