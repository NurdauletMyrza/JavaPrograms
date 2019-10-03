package exercises.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_20 {
    /** Revice selection sort */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten double numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(double[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            // Find the minimum in the list[i..list.length-1]
            double currentMax = numbers[i];
            int currentMaxIndex = i;

            for (int j = 0; j < i; j++) {
                if (currentMax < numbers[j]) {
                    currentMax = numbers[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                numbers[currentMaxIndex] = numbers[i];
                numbers[i] = currentMax;
            }
        }
    }
}
