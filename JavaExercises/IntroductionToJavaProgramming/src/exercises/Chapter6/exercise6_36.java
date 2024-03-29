package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_36 {
    /** Geometry: area of a regular polygon */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is " + area(n, side));
    }

    public static double area(int n, double side) {
        double area = n * side * side / 4 / Math.tan(Math.PI / n);
        return area;
    }
}
