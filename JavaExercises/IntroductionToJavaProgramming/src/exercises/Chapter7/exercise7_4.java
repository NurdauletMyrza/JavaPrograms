package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_4 {
    /** Analyze scores */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers1;
        double[] numbers2 = new double[0];
        System.out.print("Enter scores: ");
        do {
            numbers1 = numbers2;
            numbers2 = new double[numbers1.length + 1];
            System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
            numbers2[numbers2.length - 1] = input.nextDouble();
        } while (numbers2[numbers2.length - 1] >= 0);

        int count = 0;
        double average = getAverage(numbers1);
        for (double number: numbers1) {
            if (number < average) {
                count++;
            }
        }

        System.out.println(numbers1.length - count + " bigger than average");
        System.out.println(count + " lower than average");
    }

    public static double getAverage(double... numbers) {
        double sum = 0;
        for (double number: numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
