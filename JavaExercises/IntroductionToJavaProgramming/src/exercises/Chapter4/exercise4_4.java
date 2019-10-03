package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_4 {
    public static void main(String[] args) {
        // Prompt the user to enter the side
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Compute an Area
        double area = 6 * s * s / 4 / Math.tan(Math.PI / 6);

        // Display result
        System.out.print("The area of the hexagon is " + (int)(area * 100) / 100.0);
    }
}
