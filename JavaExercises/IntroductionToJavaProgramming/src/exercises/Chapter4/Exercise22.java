package exercises.Chapter4;
import java.util.Scanner;

public class Exercise22 {
    /** Check substring */
    public static void main(String[] args) {
        // Prompt the user to enter two string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        // Display result
        System.out.print(s2 + " is " + (s1.contains(s2) ? "" : "not ") + "a substring of " + s1);
    }
}
