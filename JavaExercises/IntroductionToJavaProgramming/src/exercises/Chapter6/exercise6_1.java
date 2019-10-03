package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_1 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBERS_PER_LINE = 10;
        for (int i = 0; i < 100; i++) {
            int pentagonalNumber = getPentagonalNumber(i);
            System.out.print((i % NUMBERS_PER_LINE == 0) ? "\n" + pentagonalNumber + " " : pentagonalNumber + " ");
        }
    }

    /** Math: pentagonal numbers */
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
