package exercises.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_18 {
    /** Bubble sort */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSort(double[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
}
