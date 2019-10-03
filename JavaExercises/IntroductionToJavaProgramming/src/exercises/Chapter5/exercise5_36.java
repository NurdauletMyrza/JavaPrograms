package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_36 {
    /** Business application: checking ISBN */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter first nine digits
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int nineDigits = input.nextInt();
        int digits = nineDigits;

        // Compute each digit
        int digit10 = 0;
        for (int i = 9; i > 0; i--) {
            byte digit = (byte)(digits % 10);
            digits /= 10;

            // Compute 10-digit
            digit10 = (digit10 + digit * i) % 11;
        }

        // Display the ISBN-10 number
        System.out.print(nineDigits);
        if (digit10 == 10)
            System.out.print("X");
        else
            System.out.print(digit10);
    }
}
