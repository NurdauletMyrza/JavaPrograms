package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_14 {
    /** Compute the greatest common divisor */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers(integers)
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int d = number1;
        int divisor = 1;
        if (number1 > number2)
            d = number2;

        for (;d > 1; d--) {
            if (number1 % d == 0 && number2 % d == 0 && d > divisor) {
                divisor = d;
            }
        }

        System.out.println("The greatest common divisor is " + divisor);
    }
}
