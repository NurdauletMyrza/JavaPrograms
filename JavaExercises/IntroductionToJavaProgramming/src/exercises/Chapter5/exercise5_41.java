package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_41 {
    /** Occurrence of max numbers */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Assign max and count
        int max = 0;
        int count = 1;

        // Prompt the user to enter numbers
        System.out.print("Enter numbers: ");
        while (true) {
            // Enter positive Integer
            int number = input.nextInt();
            // Count repetition
            if (number == max) {
                count++;
            }
            // Checks which number is biggest
            if (number > max) {
                max = number;
                count = 1;
            }
            // Stop getting numbers if input = 0
            if (number == 0) {
                break;
            }
        }

        // Display result
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
