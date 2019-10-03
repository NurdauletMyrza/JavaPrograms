package exercises.Chapter3;

/** Game: addition quiz */
public class Exercise10 {
    public static void main(String[] args) {
        // 1.Generate two single digits into number1 and number2

        double d = new java.util.Scanner(System.in).nextDouble();
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // 2. Prompt hte student to answer "What is number1 + number2?"
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = new java.util.Scanner(System.in).nextInt();

        // 3. Grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
