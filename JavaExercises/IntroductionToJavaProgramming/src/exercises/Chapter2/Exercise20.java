package exercises.Chapter2;

/** Financial application: calculate interest */
public class Exercise20 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        System.out.printf("The interest is %f", balance * interestRate / 1200);
    }
}
