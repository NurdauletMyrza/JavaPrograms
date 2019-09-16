package exercises.Chapter2;

/** Health application: computing BMI */
public class Exercise14 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        final double POUND_IN_KILOGARMS = 0.45359237;
        final double INCH_IN_KILOGRAMS = 0.0254;
        System.out.printf("BMI is %f", weight * POUND_IN_KILOGARMS / Math.pow(height * INCH_IN_KILOGRAMS, 2));
    }
}
