package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_9 {
    /** Find the Unicode of a character */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Compute Unicode number
        int n = (int)ch;

        // Display result
        System.out.printf("The Unicode for the character %c is %d", ch, n);
    }
}
