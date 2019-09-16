package exercises.Chapter2;

/** Financial application: compound value */
public class Exercise13 {
    public static void main(String[] args) {
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = new java.util.Scanner(System.in).nextDouble();
        final double ANNUAL_INTEREST_RATE = 5;
        double totalValue = savingAmount * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        totalValue = (savingAmount + totalValue) * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        totalValue = (savingAmount + totalValue) * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        totalValue = (savingAmount + totalValue) * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        totalValue = (savingAmount + totalValue) * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        totalValue = (savingAmount + totalValue) * (100 + ANNUAL_INTEREST_RATE / 12) / 100;
        System.out.printf("After the sixth month, the account value is $%f", totalValue);
    }
}
