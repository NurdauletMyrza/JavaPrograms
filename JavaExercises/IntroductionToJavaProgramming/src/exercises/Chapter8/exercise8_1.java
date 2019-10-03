package exercises.Chapter8;
import java.util.Scanner;

public class exercise8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }

    /** Sum elements column by column */
    public static double sumColumn(double[][] m, int columnIndex) {
        double columnSum = 0;
        for (int row = 0; row < m.length; row++) {
            columnSum += m[row][columnIndex];
        }

        return columnSum;
    }
}
