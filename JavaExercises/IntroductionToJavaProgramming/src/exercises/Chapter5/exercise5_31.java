package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_31 {
    /** Financial application: compute CD value */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double yield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        // Compute result and display
        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            amount *= 1 + yield / 1200;
            System.out.printf("%-8d%-8.2f\n", i, amount);
        }
    }
}
