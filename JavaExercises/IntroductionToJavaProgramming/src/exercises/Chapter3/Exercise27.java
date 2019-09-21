package exercises.Chapter3;

/** Geometry: points in triangle? */
public class Exercise27 {
    public static void main(String[] args) {
        // Prompt the user to enter a coordinate of point
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Display result
        System.out.printf("The point is%s in the triangle", (y >= 0 && x >= 0 && y <= 100 - x / 2) ? "" : " not");
    }
}
