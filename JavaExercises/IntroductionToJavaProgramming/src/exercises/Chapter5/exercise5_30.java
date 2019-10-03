package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_30 {
    /** Financial application: compound value */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        int interestRate = input.nextInt();
        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        // Compute result
        double sum = 0;
        for (int i = 0; i < months; i++) {
            sum = (sum + amount) * (1 + interestRate / 1200.);
        }

        // Display result
        System.out.println("Your savings: " + sum);
    }
}
