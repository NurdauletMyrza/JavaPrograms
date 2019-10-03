package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_5 {
    /** Geometry: area of a regular polygon */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number of sides
        System.out.print("Enter the number of sides: ");
        double sides = input.nextDouble();

        // Prompt the user to enter length of side
        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        // Compute area
        double area = sides * length * length / 4 / Math.tan(Math.PI / sides);

        // Display result
        System.out.println("The area of the polygon is " + area);
    }
}
