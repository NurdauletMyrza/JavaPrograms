package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_34 {
    /** Game: scissor, rock, paper */
    public static void main(String[] args) {// Create a Scanner
        Scanner input = new Scanner(System.in);

        byte userWins = 0;
        byte compWins = 0;

        while (userWins < 3 && compWins < 3) {
            // Prompt the user to enter number
            System.out.print("scissor (0), rock (1), paper(2): ");
            byte user = input.nextByte();

            // Generate random number
            byte computer = (byte) (Math.random() * 3);

            // Display result
            System.out.print("Computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
            }
            System.out.print(". You are ");
            switch (user) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
            }
            System.out.print(". ");
            if (user == computer)
                System.out.println("It is a draw");
            else {
                String result = "";
                switch (user) {
                    case 0:
                        result = computer == 2 ? "You won" : "You lose";
                        break;
                    case 1:
                        result = computer == 0 ? "You won" : "You lose";
                        break;
                    case 2:
                        result = computer == 1 ? "You won" : "You lose";
                }
                if (result.endsWith("won")) {
                    userWins++;
                }
                else {
                    compWins++;
                }
                System.out.println(result);
            }
            System.out.println("user vs comp");
            System.out.printf("  %d  ||  %d\n", userWins, compWins);
        }
    }
}
