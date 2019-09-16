package exercises.Chapter2;

import java.util.Scanner;

/** Science: calculating energy */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double temp0 = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double temp1 = input.nextDouble();
        final double CONST = 4184;
        System.out.printf("The energy needed is %f", mass * (temp1 - temp0) * CONST);
    }
}
