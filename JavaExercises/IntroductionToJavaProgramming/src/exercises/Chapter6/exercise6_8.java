package exercises.Chapter6;

public class exercise6_8 {
    /** Main method */
    public static void main(String[] args) {
        displayTitle();
        System.out.println();
        displayTable();
    }

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    /** Converts from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    /** Display table of temperatures */
    public static void displayTable() {
        for (int i = 40, j = 120; i > 30; i--, j-=10){
            double celsius1 = (double)i;
            double fahrenheit1 = celsiusToFahrenheit(celsius1);
            double fahrenheit2 = (double)j;
            double celsius2 = fahrenheitToCelsius(fahrenheit2);
            System.out.printf("%-10.1f%-10.1f\t|\t%-10.1f%-10.2f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
        }
    }

    /** Display title */
    public static void displayTitle() {
        System.out.printf("%-10s%-10s\t|\t%-10s%-10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        for (int i = 0; i < 49; i++)
            System.out.print("_");
    }
}
