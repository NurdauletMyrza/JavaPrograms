package exercises.Chapter3;

/** Science: wind-chill temperature */
public class Exercise20 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Declare values
        double twc, t, v;
        // Prompt to assign values
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        t = input.nextDouble();
        if (t >= -58 && t <= 41) {
            System.out.print("Enter the wind speed (>=2) in miles per hour: ");
            v = input.nextDouble();
            if (v >= 2) {
                // Compute wind chill
                twc = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
                // Display result
                System.out.printf("The wind chill index is %1.5f", twc);
            }
            else {
                System.out.print("ErrorSpeed: invalid");
            }
        }
        else {
            System.out.print("ErrorTemperature: invalid");
        }
    }
}
