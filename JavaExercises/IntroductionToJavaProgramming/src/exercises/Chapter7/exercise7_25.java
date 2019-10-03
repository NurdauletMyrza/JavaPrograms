package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_25 {
    /** Algebra: solve quadratic equations */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Declare a, b, c, disc
        double a, b, c, disc;

        // Prompt the user to enter a, b, c
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Compute disc
        disc = Math.pow(b, 2) - 4 * a * c;


        // Display result
        System.out.print("The equation has ");
        if (disc > 0) {
            double x1 = (-b + Math.pow(disc, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(disc, 0.5)) / (2 * a);
            System.out.println("two roots " + x1 + " and " + x2);
        }
        else if (disc == 0) {
            double x = -b / 2 /a;
            System.out.print("one root " + x);
        }
        else {
            System.out.println("has no real roots");
        }
    }
}
