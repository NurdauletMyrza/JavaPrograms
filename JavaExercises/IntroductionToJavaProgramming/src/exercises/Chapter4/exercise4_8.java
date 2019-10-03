package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_8 {
    /** Find the character of an ASCII code */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number of ASCII code
        System.out.print("Enter an ASCII code: ");
        int n = input.nextInt();
        if (!(0 <= n && n <= 127)) {
            System.out.println("Invalid input.");
            System.exit(1);
        }

        // Compute character
        char ch = (char)n;

        // Display result
        System.out.printf("The character for ASCII code %d is %c", n, ch);
    }
}
