package exercises.Chapter3;

/** Geometry: point on line segment */
public class Exercise34 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter coordinates of three points
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute arithmetic
        double place = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        String sth = (place == 0 && x0 <= x2 && x2 <= x1) ? "" : "not ";

        // Display result
        System.out.printf("(%1.1f, %1.1f) is %son the line segment from (%1.1f, %1.1f) to (%1.1f, %1.1f)", x2, y2, sth, x0, y0, x1, y1);
    }
}
