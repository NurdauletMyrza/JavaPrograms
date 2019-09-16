package exercises.Chapter2;

/** Science: wind-chill temperature */
public class Exercise17 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        System.out.printf("The wind-chill index is %f", 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16));
    }
}
