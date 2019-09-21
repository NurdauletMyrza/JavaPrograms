package exercises.Chapter3;

/** Compute the perimeter of a triangle */
public class Exercise19 {
    public static void main(String[] args) {
        // Prompt the user to enter edges
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter edges of triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Display result
        if (a < b + c && b < a + c && c < a + b)
            System.out.println("Perimeter is " + (a + b + c));
        else {
            System.out.print("Error: invalid input");
            System.exit(1);
        }
    }
}
