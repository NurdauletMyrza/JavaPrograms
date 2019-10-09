package exercises.Chapter4;

public class Exercise2 {
    /** Geometry: great circle distance */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        final double RADIUS = 6371.01;
        // Prompt the user to enter point 1
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Prompt the user to enter point 2
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute distance
        double distance = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        // Display result
        System.out.printf("The distance between the two points is %1.11f km", distance);
    }
}
