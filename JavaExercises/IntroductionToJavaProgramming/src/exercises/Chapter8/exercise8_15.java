package exercises.Chapter8;

import java.util.Scanner;

/** Geometry: same line? */
public class exercise8_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[row].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }
        System.out.printf("The five points are %son the same line", onTheSameLine(points) ? "" : "not ");
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    private static boolean onTheSameLine(double[][] points) {
        boolean onLine = true;
        for (int i = 0; i < points.length - 2; i++) {
            onLine = onLine && (points[i][1] - points[i + 1][1]) / (points[i][0] - points[i + 1][0]) == (points[i][1] - points[i + 2][1]) / (points[i][0] - points[i + 2][0]);
        }
        return onLine;
    }
}
