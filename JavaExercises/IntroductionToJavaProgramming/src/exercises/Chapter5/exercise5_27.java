package exercises.Chapter5;

public class exercise5_27 {
    /** Display leap years */
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                // Display result
                count++;
                System.out.print(year + " ");
                if (count % PER_LINE == 0) {
                    System.out.println();
                }
            }
        }
    }
}
