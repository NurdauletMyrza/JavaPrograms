package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_28 {
    /** Display the first days of each month */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year and first day of the week
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day: ");
        int day = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int jan = day;
        int feb = (jan + 3) % 7;
        int mar = (isLeapYear ? feb + 1 : feb) % 7;
        int apr = (mar + 3) % 7;
        int may = (apr + 2) % 7;
        int jun = (may + 3) % 7;
        int jul = (jun + 2) % 7;
        int aug = (jul + 3) % 7;
        int sep = (aug + 3) % 7;
        int oct = (sep + 2) % 7;
        int nov = (oct + 3) % 7;
        int dec = (nov + 2) % 7;

        // Display result
        System.out.println("January 1, " + year + " is " + getDayName(jan));
        System.out.println("February 1, " + year + " is " + getDayName(feb));
        System.out.println("March 1, " + year + " is " + getDayName(mar));
        System.out.println("April 1, " + year + " is " + getDayName(apr));
        System.out.println("May 1, " + year + " is " + getDayName(may));
        System.out.println("June 1, " + year + " is " + getDayName(jun));
        System.out.println("July 1, " + year + " is " + getDayName(jul));
        System.out.println("August 1, " + year + " is " + getDayName(aug));
        System.out.println("September 1, " + year + " is " + getDayName(sep));
        System.out.println("October 1, " + year + " is " + getDayName(oct));
        System.out.println("November 1, " + year + " is " + getDayName(nov));
        System.out.println("December 1, " + year + " is " + getDayName(dec));
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Sunday";
        }
    }
}
