package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_22 {
    /** Financial application: loan amortization schedule */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter loan amount, number of years, and annual interest rate
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display Monthly and Total payment
        System.out.printf("Monthly Payment: %1.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %1.2f\n", totalPayment);

        // Display result
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Payment#", "Interest", "Principal", "Balance");
        double balance = totalPayment;
        double interest, principal;
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + (int)(interest * 100) / 100.0 + "\t\t" + (int)(principal * 100) / 100.0 + "\t\t" + balance);
        }
    }
}
