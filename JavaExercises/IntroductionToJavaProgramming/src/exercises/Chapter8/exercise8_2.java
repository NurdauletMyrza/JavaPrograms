package exercises.Chapter8;
import java.util.Scanner;

public class exercise8_2 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        // Display result
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    /** Sum the major diagonal in a matrix */
    public static double sumMajorDiagonal(double[][] m) {
        double sumDiagonal = 0;
        for (int i = 0; i < m.length; i++) {
            sumDiagonal += m[i][i];
        }

        return sumDiagonal;
    }
}
