package exercises.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_15 {
    /** Eliminate duplicates */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("The distinct numbers are: ");
        System.out.println(Arrays.toString(eliminateDuplicates(numbers)));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] result = new int[0];
        for (int number: list) {
            if (!isContain(result, number)) {
                result = addToArray(result, number);
            }
        }
        return result;
    }

    public static int[] addToArray(int[] array, int n) {
        int[] temp = new int[array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        temp[array.length] = n;
        return temp;
    }

    public static boolean isContain(int[] array, int n) {
        for (int number: array) {
            if (number == n) {
                return true;
            }
        }
        return false;
    }
}
