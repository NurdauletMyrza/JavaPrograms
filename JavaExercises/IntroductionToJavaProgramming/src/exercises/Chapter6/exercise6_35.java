package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_35 {
    /** Geometry: area of a pentagon */
    public static void main(String[] args) {
        // Prompt the user to enter side length
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        System.out.println("The area of the pentagon is " + area(input.nextDouble()));
    }

    /** Compute area of pentagon */
    public static double area(double side) {
        return 5 * side * side / 4 / Math.tan(Math.PI / 5);
    }
}
