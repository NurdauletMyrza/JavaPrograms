package exercises.Chapter2;

import java.util.Scanner;

/** Convert pounds into kilograms */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        final double POUNDS_IN_KILOGRAMS = 0.454;
        System.out.printf("%f pounds is %f kilograms", pounds, pounds * POUNDS_IN_KILOGRAMS);
    }
}
