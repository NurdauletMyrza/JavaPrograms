package exercises.Chapter3;

public class Exercise21 {
    /** Science day of the week */
    public static void main(String[] args) {
        // Prompt the user to enter a year, month, and day of the month
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a year, month, and day of the week: ");
        int year = input.nextInt();
        int month = input.nextInt();
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int dayMonth = input.nextInt();

        // Compute the day of the week
        int dayWeek = (dayMonth + 26 * (month + 1) / 10 + year % 100 + (year % 100) / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;

        // Display day of the week
        System.out.print("Day of the week is ");
        switch (dayWeek) {
            case 0: System.out.print("Saturday"); break;
            case 1: System.out.print("Sunday"); break;
            case 2: System.out.print("Monday"); break;
            case 3: System.out.print("Tuesday"); break;
            case 4: System.out.print("Wednesday"); break;
            case 5: System.out.print("Thursday"); break;
            case 6: System.out.print("Friday");
        }
    }
}
