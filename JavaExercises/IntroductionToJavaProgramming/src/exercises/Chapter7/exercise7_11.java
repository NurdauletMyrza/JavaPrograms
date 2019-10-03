package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_11 {
    /** Statistics: compute deviation */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double deviation = 0;
        for (double number: x) {
            deviation += Math.pow(number - mean(x), 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        for (double number: x) {
            sum += number;
        }
        return sum / x.length;
    }
}
