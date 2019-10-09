package exercises.Chapter4;
import java.util.Scanner;

public class Exercise7 {
    /** Corner point coordinate */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // Compute five points
        double angle1 = Math.PI / 2 - Math.PI * 2 / 5;
        double angle2 = Math.PI / 2;
        double angle3 = Math.PI / 2 + Math.PI * 2 / 5;
        double angle4 = Math.PI / 2 + Math.PI * 2 / 5 * 2;
        double angle5 = Math.PI / 2 + Math.PI * 2 / 5 * 3;

        // Display result
        System.out.printf("(%f, %f)\n", radius * Math.cos(angle1), radius * Math.sin(angle1));
        System.out.printf("(%f, %f)\n", radius * Math.cos(angle2), radius * Math.sin(angle2));
        System.out.printf("(%f, %f)\n", radius * Math.cos(angle3), radius * Math.sin(angle3));
        System.out.printf("(%f, %f)\n", radius * Math.cos(angle4), radius * Math.sin(angle4));
        System.out.printf("(%f, %f)\n", radius * Math.cos(angle5), radius * Math.sin(angle5));
    }
}
