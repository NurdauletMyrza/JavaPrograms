package exercises.Chapter2;

import java.util.Scanner;

/** Find the number of years */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long days = minutes / 60 / 24;
        int years = (int)(days / 365);
        days = days % 365;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}
