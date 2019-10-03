package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_28 {
    /** Math: combinations */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        printCombinations(numbers);
    }

    public static void printCombinations(int[] array) {
        for (int number1: array) {
            for (int number2: array) {
                if (number1 != number2) {
                    System.out.printf("(%d, %d)\n", number1, number2);
                }
            }
        }
    }
}
