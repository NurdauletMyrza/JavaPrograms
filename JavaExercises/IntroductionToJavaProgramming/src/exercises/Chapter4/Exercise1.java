package exercises.Chapter4;

public class Exercise1 {
    /** Geometry: area of a pentagon */
    public static void main(String[] args) {
        // Prompt the user to enter length from the center to a vertex
        System.out.print("Enter the length from the center to a vertex: ");
        double r = new java.util.Scanner(System.in).nextDouble();

        // Compute an area
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * s * s / 4 / Math.tan(Math.PI / 5);

        // Display result
        System.out.println("The area of the pentagon is " + (int)(area * 100) / 100.);
    }
}
