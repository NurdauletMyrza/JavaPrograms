package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_20 {
    /** Process a string */
    public static void main(String[] args) {
        // Prompt the user to enter string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter random string: ");
        String str = input.nextLine();

        // Display first letter and length
        System.out.println("First letter: " + str.charAt(0));
        System.out.println("Length: " + str.length());
    }
}