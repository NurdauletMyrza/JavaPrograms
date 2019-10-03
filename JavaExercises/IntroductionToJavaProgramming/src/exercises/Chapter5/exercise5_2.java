package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_2 {
    /** Repeat additions */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number of questions do you need? ");
        final int NUMBER_OF_QUESTIONS = input.nextInt();    // Number of questions
        int correctCount = 0;   // Count the number of correct answers
        int count = 0;  // Count the number of questions
        long startTime = System.currentTimeMillis();    // start time
        String output = "";// Output string is initially empty

        while (NUMBER_OF_QUESTIONS != count) {
            // 1. Generate two random single-digit integers
            int number1 = (int)(Math.random() * 15 + 1);
            int number2 = (int)(Math.random() * 15 + 1);

            // 2. Prompt the student to answer "What is number1 + number2?"
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));

            count++;    // Increase the question count

            output += "\n" + number1 + " + " + number2 + " = " + answer +((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

    }
}
