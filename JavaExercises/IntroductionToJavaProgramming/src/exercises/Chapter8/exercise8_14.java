package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_14 {
    /** Explore matrix */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int length = input.nextInt();
        int[][] matrix = createMatrix(length);
        showRows(matrix);
        showColumn(matrix);
        showDiagonals(matrix);
    }

    private static int[][] createMatrix(int length) {
        int[][] matrix = new int[length][length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    private static void showDiagonals(int[][] m) {
        int major = 0;
        int sub = 0;
        for (int i = 0; i < m.length; i++) {
            major += m[i][i];
            sub += m[i][m[i].length - i - 1];
        }
        if (major == 0 || major == 4) {
            System.out.println("All " + major / 4 + "s on the major diagonal");
        }
        else {
            System.out.println("No same numbers on the major diagonal");
        }
        if (sub == 0 || sub == 4) {
            System.out.println("All " + sub / 4 + "s on the sub-diagonal");
        }
        else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

    private static void showColumn(int[][] m) {
        int[] result = new int[m.length];
        for (int[] numbers: m) {
            for (int columns = 0; columns < numbers.length; columns++) {
                result[columns] += numbers[columns];
            }
        }
        int count = 0;
        for (int column = 0; column < result.length; column++) {
            if (result[column] == 0 || result[column] == 4) {
                System.out.println("All " + result[column] / 4 + "s on column " + column);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    private static void showRows(int[][] m) {
        int count = 0;
        for (int row = 0; row < m.length; row++) {
            int sum = 0;
            for (int number: m[row]) {
                sum += number;
            }
            if (sum == 0 || sum == 4) {
                System.out.println("All " + sum / 4 + "s on row " + row);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
    }
}
