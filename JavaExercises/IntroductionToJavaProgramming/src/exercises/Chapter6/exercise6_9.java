package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_9 {
    /** Main method */
    public static void main(String[] args) {
        displayTitle();
        System.out.println();
        displayTable();
    }

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

    /** Display table of temperatures */
    public static void displayTable() {
        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            double foot1 = (double)i;
            double meter1 = footToMeter(foot1);
            double meter2 = (double)j;
            double foot2 = meterToFoot(meter2);
            System.out.printf("%-10.1f%-10.3f\t|\t%-10.1f%-10.3f\n", foot1, meter1, meter2, foot2);
        }
    }

    /** Display title */
    public static void displayTitle() {
        System.out.printf("%-10s%-10s\t|\t%-10s%-10s\n", "Feet", "Meters", "Meters", "Feet");
        for (int i = 0; i < 49; i++)
            System.out.print("_");
    }
}
