package exercises.Chapter3;

/** Algebra: solve 2 * 2 linear equations */
public class Exercise3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double divider = a * d - b * c;
        if (divider == 0) {
            System.out.println("The equation has no solution");
            System.exit(1);
        }
        double x = (e * d - b * f) / divider;
        double y = (a * f - e * c) / divider;
        System.out.printf("x is %f and y is %f", x, y);
    }
}
