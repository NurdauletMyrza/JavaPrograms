package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_32 {
    /** Game: lottery */
    public static void main(String[] args) {
        // Generate a lottery number
        int firstDigit = (int)(Math.random() * 9 + 1);
        int secondDigit = firstDigit;
        while (firstDigit == secondDigit) {
            secondDigit = (int)(Math.random() * 10);
        }
        int lottery = firstDigit * 10 + secondDigit;

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Checks the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        }
        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2){
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
