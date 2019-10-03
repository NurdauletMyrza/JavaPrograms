package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_39 {
    /** Geometry: point position */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.printf("(%.1f, %.1f) is on the ", x2, y2);
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.print("line segment ");
        }
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print("same line ");
        }
        else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print("left side of the line ");
        }
        else {
            System.out.print("right side of the line ");
        }
        System.out.printf("from (%.1f, %.1f) to (%.1f, %.1f)", x0, y0, x1, y1);
    }

    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    private static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double place = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return place > 0;
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    private static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (y0 - y1) / (x0 - x1) == (y0 - y2) / (x0 - x2);
    }


    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    private static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x0 - x2) / (x2 - x1) == (y0 - y2) / (y2 - y1) && (x0 - x2) / (x2 - x1) >= 0 && (y0 - y2) / (y2 - y1) >= 0;
    }
}
