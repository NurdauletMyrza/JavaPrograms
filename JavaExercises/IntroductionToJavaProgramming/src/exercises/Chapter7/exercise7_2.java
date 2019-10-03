package exercises.Chapter7;

import java.util.Scanner;
import java.util.Arrays;

public class exercise7_2 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print(Arrays.toString(reverse(numbers)));
    }

    /** Reverse the numbers entered */
    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
    return reversed;
    }
}
