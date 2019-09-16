package exercises.Chapter2;

import java.util.Scanner;

/** Physics: finding runway length */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        System.out.printf("The minimum runway length for this airplane is %f", speed * speed / 2 / acceleration);
    }
}
