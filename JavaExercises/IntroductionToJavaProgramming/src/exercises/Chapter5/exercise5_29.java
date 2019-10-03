package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_29 {
    /** Display calendars */
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

        final int PER_LINE = 7;

        // Display January
        System.out.println("\t\t  January");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < jan; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + jan) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display February
        System.out.println("\t\t  February");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < feb; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= (isLeapYear ? 29 : 28); day++) {
            System.out.printf("%2d  ", day);
            if ((day + feb) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display March
        System.out.println("\t\t\tMarch");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < mar; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + mar) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display April
        System.out.println("\t\t\tApril");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < apr; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 30; day++) {
            System.out.printf("%2d  ", day);
            if ((day + apr) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display May
        System.out.println("\t\t\tMay");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < may; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + may) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display June
        System.out.println("\t\t\tJune");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < jun; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 30; day++) {
            System.out.printf("%2d  ", day);
            if ((day + jun) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display July
        System.out.println("\t\t\tJuly");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < jul; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + jul) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display August
        System.out.println("\t\t\tAugust");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < aug; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + aug) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display September
        System.out.println("\t\t  September");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < sep; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 30; day++) {
            System.out.printf("%2d  ", day);
            if ((day + sep) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display October
        System.out.println("\t\t  October");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < oct; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + oct) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display November
        System.out.println("\t\t  November");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < nov; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 30; day++) {
            System.out.printf("%2d  ", day);
            if ((day + nov) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Display December
        System.out.println("\t\t  December");
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < dec; i++) {
            System.out.print("\t");
        }
        for (day = 1; day <= 31; day++) {
            System.out.printf("%2d  ", day);
            if ((day + dec) % PER_LINE == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
