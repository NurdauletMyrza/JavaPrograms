package exercises.Chapter4;
import java.util.Scanner;

public class Exercise15 {
    /** Phone key pads */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char ch = input.next().toLowerCase().charAt(0);

        if (!Character.isAlphabetic(ch)) {
            System.out.println(ch + "is an invalid input");
            System.exit(1);
        }

        // Display result
        System.out.print("The corresponding number is ");
        if ("abc".contains(ch + "")) {
            System.out.print(2);
        }
        else if ("def".contains(ch + "")) {
            System.out.print(3);
        }
        else if ("ghi".contains(ch + "")) {
            System.out.print(4);
        }
        else if ("jkl".contains(ch + "")) {
            System.out.print(5);
        }
        else if ("mno".contains(ch + "")) {
            System.out.print(6);
        }
        else if ("pqrs".contains(ch + "")) {
            System.out.print(7);
        }
        else if ("tuv".contains(ch + "")) {
            System.out.print(8);
        }
        else {
            System.out.print(9);
        }
    }
}
