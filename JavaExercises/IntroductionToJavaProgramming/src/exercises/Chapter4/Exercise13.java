package exercises.Chapter4;
import java.util.Scanner;

public class Exercise13 {
    /** Vowel or consonant */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter letter
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        if (!(Character.isAlphabetic(ch))) {
            System.out.println(ch + " is an invalid input");
            System.exit(1);
        }

        // Display result
        System.out.println(ch + " is a " + (("aeiou".contains(("" + Character.toLowerCase(ch)))) ? "vowel" : "consonant"));
    }
}
