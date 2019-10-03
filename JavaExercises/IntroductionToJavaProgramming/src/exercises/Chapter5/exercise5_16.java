package exercises.Chapter5;
import java.util.Scanner;

public class exercise5_16 {
    /** Find the factors of an integer */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int divisor;
        while (number != 1) {
            for (divisor = 2; divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    number /= divisor;
                    break;
                }
            }
            System.out.print(divisor + ", ");
        }
    }
}
