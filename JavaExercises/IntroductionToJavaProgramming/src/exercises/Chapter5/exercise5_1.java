package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_1 {
    /** Count positive and negative numbers and compute the average of numbers */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.print("Enter an integer, the input ends if it is: ");
        int n; int count = -1;
        int positive = 0; int negative = 0; int total = 0;
        do {
            total += n = input.nextInt();
            count++;
            if (n > 0)
                positive++;
            else if (n < 0)
                negative--;
        } while (n != 0);

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        // Compute average
        double average = (double)total / count;

        // Display result
        System.out.println("The number of positive is " + positive);
        System.out.println("The number of negative is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
