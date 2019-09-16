package exercises.Chapter2;

import java.util.Scanner;

/** Compute the volume of a cylinder */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double volume = area * length;

        System.out.printf("The area is %f\nThe volume is %f", area, volume);
    }
}
