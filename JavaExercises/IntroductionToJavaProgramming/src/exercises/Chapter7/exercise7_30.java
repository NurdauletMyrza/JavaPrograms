package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_30 {
    /** Pattern recognition: consecutive four equal numbers */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.printf("The list has%s consecutive fours", isConsecutiveFour(numbers) ? "" : " no");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            int number = values[i];
            for (int j = i + 1; j < i + 4; j++) {
                if (number != values[j]) {
                    break;
                }
                if (j == i + 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
