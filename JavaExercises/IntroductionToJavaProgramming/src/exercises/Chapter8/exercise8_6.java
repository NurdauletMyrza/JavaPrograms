package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_6 {
    /** Algebra: multiply two matrices */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] m1 = new double[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix1: ");
        double[][] m2 = new double[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextDouble();
            }
        }

        double[][] result = multiplyMatrix(m1, m2);
        System.out.println("The multiplication of matrix is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.printf("\t%s\t", i == 1 ? " *  " : "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.printf("\t%s\t", i == 1 ? " =  " : "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(Math.round(result[i][j] * 10) / 10. + "\t");
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] m = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }
        return m;
    }
}
