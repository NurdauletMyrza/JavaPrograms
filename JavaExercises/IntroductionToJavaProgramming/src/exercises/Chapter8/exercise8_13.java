package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_13 {
    /** Locate the largest element */
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        displayMax(matrix);

    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] matrix = new double[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void displayMax(double[][] m) {
        int maxRow = 0;
        int maxColumn = 0;
        double max = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                if (max < m[i][j]) {
                    max = m[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
            System.out.println();
        }
        System.out.println("The location of the largest element is at (" + maxRow + ", " + maxColumn + ")");
    }
}
