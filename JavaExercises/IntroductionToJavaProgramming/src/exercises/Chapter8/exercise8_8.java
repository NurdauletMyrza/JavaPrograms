package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_8 {
    /** All closest pairs of points */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int number = input.nextInt();
        double[][] points = new double[number][2];
        System.out.print("Enter " + number + " points: ");
        for (int i = 0; i < number; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        double minDist = distance(points[0][0], points[0][1], points[1][0], points[1][1]);

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (dist == minDist) {
                    System.out.printf("The closest two points are (%1.1f, %1.1f) and (%1.1f, %1.1f)\n", points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }

        System.out.println("Their distance is " + minDist);
    }

    /** Compute the distance between two points (x1, y1) and (x2, y2) */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
