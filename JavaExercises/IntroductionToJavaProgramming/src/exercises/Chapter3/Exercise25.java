package exercises.Chapter3;

/** Geometry: intersecting point */
public class Exercise25 {
    public static void main(String[] args) {
        // Prompts the user to enter coordinates of points
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Compute result
        double s1 = (y1 - y2) / (x1 - x2);
        double s2 = (y3 - y4) / (x3 - x4);
        double y = (y1 * s2 - y3 * s1 + (x3 - x1) * s1 * s2) / (s2 - s1);
        double x = y / s2 + x3 - y3 / s2;

        // Display result
        if (s1 == s2)
            System.out.println("The two lines are parallel");
        else
            System.out.println("Teh intersecting point is at (" + x + ", " + y + ")");
    }
}
