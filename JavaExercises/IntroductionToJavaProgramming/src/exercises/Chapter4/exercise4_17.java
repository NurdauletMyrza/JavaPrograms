package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_17 {
    /** Days of a month */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // Prompt the user to enter a month
        System.out.print("Enter a month: ");
        String month = input.next();

        // Compute days
        int days = 0;
        switch (month) {
            case "Jan": days = 31; break;
            case "Feb": days = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28; break;
            case "Mar": days = 31; break;
            case "Apr": days = 30; break;
            case "May": days = 31; break;
            case "Jun": days = 30; break;
            case "Jul": days = 31; break;
            case "Aug": days = 31; break;
            case "Sep": days = 30; break;
            case "Oct": days = 31; break;
            case "Nov": days = 30; break;
            case "Dec": days = 31; break;
            default: System.out.println("Error type month"); System.exit(1);
        }

        // Display result
        System.out.printf("%s %d has %d days", month, year, days);
    }
}
