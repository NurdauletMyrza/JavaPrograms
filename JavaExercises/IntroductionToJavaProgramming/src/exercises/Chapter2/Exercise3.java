package exercises.Chapter2;

import java.util.Scanner;

/** Convert feet into meters */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        final double FOOT_IN_METER = 0.305;
        System.out.printf("%f feet is %f meters", feet, feet * FOOT_IN_METER);
    }
}
