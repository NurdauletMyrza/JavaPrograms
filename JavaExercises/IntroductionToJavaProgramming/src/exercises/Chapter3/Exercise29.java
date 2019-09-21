package exercises.Chapter3;

/** Geometry: two circles */
public class Exercise29 {
    public static void main(String[] args) {
        // Prompt the user to enter characteristics of circles
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        // Compute and display result
        double distanceBetweenCenters = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        if (distanceBetweenCenters <= Math.abs(radius1 - radius2))
            System.out.println("Circle2 is inside circle1");
        else if (distanceBetweenCenters <= radius1 + radius2)
            System.out.println("Circle2 overlaps circle1");
        else
            System.out.println("Circle2 does not overlap circle1");
    }
}
