package exercises.Chapter3;

/** Geometry: point in a rectangle? */
public class Exercise23 {
    public static void main(String[] args) {
        // Prompt the user to enter a coordinate of point
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Display result
        System.out.printf("Point (%f, %f) is %sin the rectangle", x, y, (!(x <= 5 && x >= -5 || y <= 5.0 / 2 && y >= -5.0 / 2) ? "not " : ""));
    }
}
