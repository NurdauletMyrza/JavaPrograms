package exercises.Chapter3;

/** Algebra: solve quadratic equations */
public class Exercise1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.print("The equation has ");
        if (discriminant > 0) {
            System.out.printf("two roots %f and %f", (-b + Math.sqrt(discriminant)) / 2 / a, (-b - Math.sqrt(discriminant)) / 2 / a);
        }
        else if (discriminant == 0) {
            System.out.printf("one root %f", -b / 2 / a);
        }
        else {
            System.out.print("no real roots");
        }
    }
}
