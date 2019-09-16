package exercises.Chapter2;

import java.util.Scanner;

/** Sum the digits in an integer */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        System.out.printf("The sum of the digits is %d", num % 1000 / 100 + num % 100 / 10+ num % 10);
    }
}
