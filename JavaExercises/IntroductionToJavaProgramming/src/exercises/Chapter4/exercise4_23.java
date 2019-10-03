package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_23 {
    /** Financial application: payroll */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter information
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double workedHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        // Display result
        double grossPay = workedHours * hourlyPayRate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + workedHours);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deduction:\n  Federal Withholding (" + (federalTax * 100) + "%): $" + federalWithholding);
        System.out.println("  State Withholding (" + (stateTax * 100) + "%): $" + stateWithholding);
        System.out.println("  Total deduction: $" + totalDeduction);
        System.out.println("Nat Pay: $" + (grossPay - totalDeduction));
    }
}
