package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_7 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        // Display table
        System.out.printf("%-10s%15s\n", "Years", "Future Value");
        for (int i = 1; i <= 30; i++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
            System.out.printf("%-10d%15.2f\n", i, futureValue);
        }
    }

    /** Financial application: compute the future investment value */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        // Compute futureInvestmentValue
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        return futureInvestmentValue;
    }
}
