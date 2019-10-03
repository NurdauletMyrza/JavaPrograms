package exercises.Chapter7;

import java.util.Scanner;
import java.util.Arrays;

public class exercise7_5 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        distinctNumber(numbers);
    }

    /** Print distinct numbers */
    public static void distinctNumber(int[] numbers) {
        int[] distinctNumber = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (!isInArray(distinctNumber, numbers[i])) {
                count++;
                distinctNumber[i] = numbers[i];
            }
            System.out.println(Arrays.toString(distinctNumber));
        }

        // Display result
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int n: distinctNumber) {
            if (n != 0) {
                System.out.print(n + " ");
            }
        }
    }

    /** Return true if in array, otherwise false */
    public static boolean isInArray(int[] numbers, int number) {
        boolean b = false;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                b = true;
            }
        }
        return b;
    }
}
