package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_5 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    /** Sort three numbers */
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double min = min(min(num1, num2), min(num2, num3));
        double max = max(max(num1, num2), max(num2, num3));
        double middle = 0;
        if (min == num1) middle = min(num2, num3);
        else if (min == num2) middle = min(num1, num3);
        else middle = min(num1, num2);

        System.out.println(min + " " + middle + " "  + max);
    }

    /** Return minimum */
    public static double min(double num1, double num2) {
        if (num1 < num2) return num1;
        return num2;
    }

    /** Return maximum */
    public static double max(double num1, double num2) {
        if (num1 > num2) return num1;
        return num2;
    }
}
