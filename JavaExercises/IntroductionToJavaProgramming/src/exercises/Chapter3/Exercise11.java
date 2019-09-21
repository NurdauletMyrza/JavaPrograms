package exercises.Chapter3;

/** Find the number of days in a month */
public class Exercise11 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter number of year and month
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1: System.out.print("January " + year + " had " + 31); break;
            case 2: System.out.print("February " + year + " had " + (isLeapYear ? 29 : 28)); break;
            case 3: System.out.print("March " + year + " had " + 31); break;
            case 4: System.out.print("April " + year + " had " + 30); break;
            case 5: System.out.print("May " + year + " had " + 31); break;
            case 6: System.out.print("June " + year + " had " + 30); break;
            case 7: System.out.print("July " + year + " had " + 31); break;
            case 8: System.out.print("August " + year + " had " + 31); break;
            case 9: System.out.print("September " + year + " had " + 30); break;
            case 10: System.out.print("October " + year + " had " + 31); break;
            case 11: System.out.print("November " + year + " had " + 30); break;
            case 12: System.out.print("December " + year + " had " + 31);
        }
    }
}
