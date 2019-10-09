package exercises.Chapter4;
import java.util.Scanner;

public class Exercise3 {
    /** Geography estimate areas */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;
        // Prompt the user to enter point Atlanta
        System.out.print("Enter point Atlanta, Georgia (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Prompt the user to enter point Orlando
        System.out.print("Enter point Orlando, Florida (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        // Prompt the user to enter point Savannah
        System.out.print("Enter point Savannah, Georgia (latitude and longitude) in degrees: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        // Prompt the user to enter point Charlotte
        System.out.print("Enter point Charlotte, North Carolina (latitude and longitude) in degrees: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Compute distance
        double distance1to2 = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        double distance1to3 = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1 - y3)));
        double distance2to3 = RADIUS * Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y2 - y3)));
        double distance3to4 = RADIUS * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3 - y4)));
        double distance4to1 = RADIUS * Math.acos(Math.sin(Math.toRadians(x4)) * Math.sin(Math.toRadians(x1)) + Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(y4 - y1)));

        // Compute area
        double s, area;
        s = (distance1to2 + distance2to3 + distance1to3) / 2;
        area = Math.pow(s * (s - distance1to2) * (s - distance2to3) * (s - distance1to3), 0.5);
        s = (distance3to4 + distance4to1 + distance1to3) / 2;
        area += Math.pow(s * (s - distance1to3) * (s - distance4to1) * (s - distance3to4), 0.5);

        // Display result
        System.out.println("The area is " + area);
    }
}
