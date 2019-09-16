package exercises.Chapter2;

/** Financial application: calculate future investment value */
public class Exercise21 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double years = input.nextInt();
        System.out.printf("Accumulated value is $%f", investmentAmount * Math.pow(1 + interestRate / 1200, years * 12));
    }
}
