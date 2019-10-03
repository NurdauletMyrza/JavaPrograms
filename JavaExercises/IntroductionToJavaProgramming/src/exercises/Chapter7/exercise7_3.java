package exercises.Chapter7;
import java.util.Scanner;
import java.util.Arrays;

public class exercise7_3 {
    /** Count occurrence of numbers */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] numbers = new int[101];
        int n;
        do {
            n = input.nextInt();
            numbers[n] += 1;
        } while (n != 0);

        // Display result
        for (int i = 1; i <= 100; i++) {
            if (numbers[i] != 0) System.out.printf("%d occurs %d times\n", i, numbers[i]);
        }
    }


}
