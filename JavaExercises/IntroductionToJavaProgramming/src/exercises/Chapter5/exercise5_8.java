package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_8 {
    /** Find the highest score */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number of students
        System.out.print("Enter a number of students: ");
        int number = input.nextInt();

        double score;
        double highScore = 0;
        String name;
        String highName = "";

        for (int i = 0; i < number; i++) {
            // Prompt the user to enter name and score
            System.out.print("Enter a name and score: ");
            name = input.next();
            score = input.nextDouble();
            if (score > highScore) {
                highScore = score;
                highName = name;
            }
        }

        // Display result
        System.out.printf("%s with a score %.2f%%", highName, highScore);
    }
}
