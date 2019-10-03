package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_17 {
    /** Display pyramid */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int i = 0; i < number - row; i++) {
                System.out.print("  ");
            }
            for (int i = row; i > 1; i--) {
                System.out.print(i + " ");
            }
            System.out.print(1);
            for (int i = 2; i <= row; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
