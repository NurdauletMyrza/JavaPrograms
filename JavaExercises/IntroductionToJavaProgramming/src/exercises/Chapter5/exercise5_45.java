package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_45 {
    /** Statistics: compute mean and standard deviation */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double sum2 = 0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            sum += number;
            sum2 += Math.pow(number, 2);
        }
        double mean = sum / 10;
        double deviation = Math.sqrt((sum2 - Math.pow(sum, 2) / 10) / 9);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + (int)(deviation * 100000) / 100000.);
    }
}
