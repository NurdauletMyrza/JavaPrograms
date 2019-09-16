package exercises.Chapter2;

import java.util.Scanner;

/** Convert Celsius to Fahrenheit */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double cDegree = input.nextDouble();    // Celsius
        double fDegree = 9 * cDegree / 5 + 32;  // Fahrenheit
        System.out.printf("%f Celsius is %f Fahrenheit", cDegree, fDegree);
    }
}
