package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_12 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two characters and number per line
        System.out.print("Enter char1: ");
        char ch1 = input.nextLine().charAt(0);
        System.out.print("Enter char2: ");
        char ch2 = input.nextLine().charAt(0);
        System.out.print("Enter number per line: ");
        int numberPerLine = input.nextInt();

        printChars(ch1, ch2, numberPerLine);
    }

    /** Display characters */
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (char ch = ch1; ch <= ch2; ch++) {
            if ((ch - ch1) % numberPerLine == 0)
                System.out.println();
            System.out.print(ch + " ");
        }
    }
}
