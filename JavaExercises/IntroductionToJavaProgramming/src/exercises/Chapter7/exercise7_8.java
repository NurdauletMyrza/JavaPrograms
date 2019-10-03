package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_8 {
    /** Average an array */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doubleNumbers[] = new double[10];
        System.out.print("Enter 10 double: ");
        for (int i = 0; i < 10; i++) {
            doubleNumbers[i] = input.nextDouble();
        }
        System.out.println(average(doubleNumbers));
        int intNumbers[] = new int[10];
        System.out.print("Enter 10 int: ");
        for (int i = 0; i < 10; i++) {
            intNumbers[i] = input.nextInt();
        }
        System.out.println(average(intNumbers));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double number: array) {
            sum += number;
        }
        return sum / array.length;
    }
}
