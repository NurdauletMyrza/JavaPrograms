package exercises.Chapter2;

import java.util.Scanner;

/** Physics: acceleration */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();
        System.out.printf("The average acceleration is %f", (velocity1 - velocity0) / time);
    }
}
