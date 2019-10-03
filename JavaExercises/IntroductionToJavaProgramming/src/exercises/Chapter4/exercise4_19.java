package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_19 {
    /** Business: check ISBN-10 */
        public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter first nine digits
            System.out.print("Enter the first 9 digits of an ISBN as integer: ");
            String nineDigits = input.nextLine();

            // Compute each digit
            int digit1 = nineDigits.charAt(0) - '0';
            int digit2 = nineDigits.charAt(1) - '0';
            int digit3 = nineDigits.charAt(2) - '0';
            int digit4 = nineDigits.charAt(3) - '0';
            int digit5 = nineDigits.charAt(4) - '0';
            int digit6 = nineDigits.charAt(5) - '0';
            int digit7 = nineDigits.charAt(6) - '0';
            int digit8 = nineDigits.charAt(7) - '0';
            int digit9 = nineDigits.charAt(8) - '0';

            // Compute 10-digit
            byte digit10 = (byte)((digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11);

            // Display the ISBN-10 number
            System.out.print(nineDigits);
            if (digit10 == 10)
                System.out.print("X");
            else
                System.out.print(digit10);
        }
}
