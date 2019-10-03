package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_9 {
    /** Find the two highest score */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        String name;
        double score;
        String highestName1 = "", highestName2 = "";
        double highestScore1 = 0, highestScore2 = 0;
        for (int i = 0; i < n; i++) {
            // Prompt the user to enter the name of student and score
            System.out.print("Enter the name of student and score: ");
            name = input.next();
            score = input.nextDouble();
            if (score > highestScore2) {
                highestName2 = name;
                highestScore2 = score;
                if (highestScore2 > highestScore1) {
                    String tempName = highestName2;
                    highestName2 = highestName1;
                    highestName1 = tempName;
                    double tempScore = highestScore2;
                    highestScore2 = highestScore1;
                    highestScore1 = tempScore;
                }
            }
        }

        // Display result
        System.out.printf("The first highest score student name %s score %.1f\n", highestName1, highestScore1);
        System.out.printf("The second highest score student name %s score %.1f\n", highestName2, highestScore2);
    }
}
