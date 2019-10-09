package exercises.Chapter4;
import java.util.Scanner;

public class Exercise14 {
    /** Convert letter grade to number */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter grade
        System.out.print("Enter a letter grade: ");
        char ch = input.next().charAt(0);

        if (!(ch >= 'A' && ch <= 'F')) {
            System.out.println(ch + " is an invalid grade");
            System.exit(1);
        }

        // Display result
        System.out.print("The numeric value for grade " + ch + " is ");
        switch (ch) {
            case 'A': System.out.print(4); break;
            case 'B': System.out.print(3); break;
            case 'C': System.out.print(2); break;
            case 'D': System.out.print(1); break;
            case 'F': System.out.print(0);
        }
    }
}
