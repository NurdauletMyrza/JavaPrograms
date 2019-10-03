package exercises.Chapter7;
import java.util.Scanner;

public class exercise7_1 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        System.out.print("Enter 4 scores: ");
        int[] studentsScores = new int[students];
        for (int i = 0; i < studentsScores.length; i++) {
            studentsScores[i] = input.nextInt();
        }

        assignGrades(studentsScores);
    }

    /** Assign grades */
    public static void assignGrades(int[] scores) {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Grade is %d score is %d and grade is %c\n", i, scores[i], grade(scores[i], best));
        }
    }

    /** Return grade */
    public static char grade(int score, int best) {
        if (score >= best - 10) return 'A';
        else if (score >= best - 20) return 'B';
        else if (score >= best - 30) return 'C';
        else if (score >= best - 40) return 'D';
        else return 'F';
    }

    /** Find maximum */
    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
}
