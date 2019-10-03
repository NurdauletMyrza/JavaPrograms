package exercises.Chapter7;

import java.util.Arrays;
import java.util.Random;

public class exercise7_16 {
    /** Execution time */
    public static void main(String[] args) {
        int[] numbers = createRandomIntArray(100_000);
        int number = numbers[(int)(Math.random() * numbers.length)];
        System.out.println(number);
        long time = System.currentTimeMillis();
        int index = linearSearch(numbers, number);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(numbers[index]);
        selectionSort(numbers);
        time = System.currentTimeMillis();
        index = binarySearch(numbers, number);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(numbers[index]);
    }

    public static int[] createRandomIntArray(int length) {
        Random rn = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = rn.nextInt();
        }
        return numbers;
    }

    public static int linearSearch(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;    // Now high < low, key not found
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = numbers[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
