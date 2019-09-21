package exercises.Chapter3;

/** Financial: current exchange */
public class Exercise31 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter exchange rate from to dollar to RMB
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollarToRMB = input.nextDouble();

        // Prompt the user to enter 0 or 1 (0 for convert dollar to RMB and 1 for convert RMB to dollar)
        System.out.print("Enter 0 to convert dollars to RMB and 1 vise versa: ");
        int convertType = input.nextInt();
        if (convertType != 0 && convertType != 1) {
            System.out.println("Incorrect input");
            System.exit(1);
        }

        // Prompt the user to enter amount of money
        System.out.printf("Enter the %s amount: ", (convertType == 0) ? "dollar" : "RMB");
        double amount = input.nextDouble();

        // Compute result
        double result = (convertType == 0) ? amount * dollarToRMB : amount / dollarToRMB;

        // Display result
        if (convertType == 0) {
            System.out.printf("$%1.1f is %1.1f yuan", amount, result);
        }
        else
            System.out.printf("%1.1f yuan is $%1.2f", amount, result);
    }
}
