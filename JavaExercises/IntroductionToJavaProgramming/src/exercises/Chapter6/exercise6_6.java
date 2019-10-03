package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_6 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        displayPattern(n);
    }

    /** Display patterns */
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j <= i)
                    System.out.print(j + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
