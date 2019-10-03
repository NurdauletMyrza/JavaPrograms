package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_21 {
    /** Financial application: compare loans with various interest rates */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the loan amount and number of years
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        // Display table
        System.out.printf("%-20s%-20s%-20s\n\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double annualInterestRate = 5; annualInterestRate < 8.1; annualInterestRate += 0.125) {
            // Obtain monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;
            // Calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%1.3f%%\t\t\t\t%-20.2f%-20.2f\n", monthlyInterestRate, monthlyPayment, totalPayment);
        }

    }
}
