package exercises.Chapter3;

/** Geometry: two rectangles */
public class Exercise28 {
    public static void main(String[] args) {
        // Prompt the user to enter characteristics of rectangles
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        // Compute result
        if (x2 + width2 / 2 <= x1 + width1 / 2 && x2 - width2 / 2 >= x1 - width1 / 2 && y2 + height2 / 2 <= y1 + height1 / 2 && y2 - height2 / 2 >= y1 - height1 / 2)
            System.out.print("r2 is inside r1");
        else {
            if ((x2 + width2 / 2 <= x1 + width1 / 2 && x2 + width2 / 2 >= x1 - width1 / 2 && y2 + height2 / 2 <= y1 + height1 / 2 && y2 + height2 / 2 >= y1 - height1 / 2)
                    || (x2 + width2 / 2 <= x1 + width1 / 2 && x2 + width2 / 2 >= x1 - width1 / 2 && y2 - height2 / 2 <= y1 + height1 / 2 && y2 - height2 / 2 >= y1 - height1 / 2)
                    || (x2 - width2 / 2 <= x1 + width1 / 2 && x2 - width2 / 2 >= x1 - width1 / 2 && y2 + height2 / 2 <= y1 + height1 / 2 && y2 + height2 / 2 >= y1 - height1 / 2)
                    || (x2 - width2 / 2 <= x1 + width1 / 2 && x2 - width2 / 2 >= x1 - width1 / 2 && y2 - height2 / 2 <= y1 + height1 / 2 && y2 - height2 / 2 >= y1 - height1 / 2))
                System.out.print("r2 overlaps r1");
            else
                System.out.print("r2 does not overlap r1");
        }
    }
}
