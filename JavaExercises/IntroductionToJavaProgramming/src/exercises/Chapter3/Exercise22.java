package exercises.Chapter3;

public class Exercise22 {
    /** Geometry: point in a circle? */
    public static void main(String[] args) {
        // Prompt the user to enter a coordinate of point
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Compute distance from center
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Display result
        System.out.printf("Point (%f, %f) is %sin the circle", x, y, (distance > 10) ? "not ": "");
    }
}
