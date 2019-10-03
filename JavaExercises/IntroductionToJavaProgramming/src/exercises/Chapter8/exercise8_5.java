package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_5 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Matrix");
        System.out.print("rows: ");
        int row1 = input.nextInt();
        System.out.print("column: ");
        int column1 = input.nextInt();
        double[][] matrix1 = new double[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1;j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Second Matrix");
        System.out.print("rows: ");
        int row2 = input.nextInt();
        System.out.print("column: ");
        int column2 = input.nextInt();
        double[][] matrix2 = new double[row2][column2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2;j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        double[][] matrix = addMatrix(matrix1, matrix2);
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    /** Adds to equal matrix */
    public static double[][] addMatrix(double[][] a, double[][] b) {
        if (equalLength(a, b)) {
            double[][] resultMatrix = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    resultMatrix[i][j] = a[i][j] + b[i][j];
                }
            }
            return resultMatrix;
        }
        else {
            System.out.println("Error: not equal size");
            return null;
        }
    }

    /** Identify whether equal matrix */
    public static boolean equalLength(double[][] a, double[][] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        return a.length == b.length;
    }
}
