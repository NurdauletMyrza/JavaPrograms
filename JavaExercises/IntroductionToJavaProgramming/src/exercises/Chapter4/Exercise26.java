package exercises.Chapter4;
import java.util.Scanner;

public class Exercise26 {
    /** Financial application: monetary units */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        int index = amount.indexOf('.');

        String numberOfOneDollars = amount;
        String numberOfOneCents = "0";

        if (index != -1) {
            // Find the number of one dollars
            numberOfOneDollars = amount.substring(0, index);

            // Find the number of one cents
            numberOfOneCents = amount.substring(1 + index);
        }

        // Display results
        System.out.printf("Your amount %s consists of $%s dollars and %s cents", amount, numberOfOneDollars, numberOfOneCents);   // output
    }
}
