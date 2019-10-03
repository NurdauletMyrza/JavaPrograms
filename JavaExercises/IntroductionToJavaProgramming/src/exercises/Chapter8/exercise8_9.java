package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_9 {
    /** Game: play a tic-tac-toe game */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] board = {{4,4,4},{4,4,4},{4,4,4}};
        int player = 1;
        while (whoWin(board) == -1) {
            displayBoard(board);
            System.out.printf("Enter a row (0, 1, or 2) for player %c: ", (player == 0) ? 'O' : 'X');
            int row = input.nextInt();
            System.out.printf("Enter a column (0, 1, or 2) for player %c: ", (player == 0) ? 'O' : 'X');
            int column = input.nextInt();
            board[row][column] = player;
            player = (player + 1) % 2;
        }
        displayBoard(board);
        player = whoWin(board);
        if (player == 1) {
            System.out.println("X player won");
        }
        else if (player == 0) {
            System.out.println("O player won");
        }
        else {
            System.out.println("It is a draw");
        }
    }

    public static void displayBoard(int[][] x) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                if (x[i][j] == 1) {
                    System.out.print(" X ");
                }
                else if (x[i][j] == 0) {
                    System.out.print(" O ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public static int whoWin(int[][] x) {
        // check x
        for (int i = 0; i < 3; i++) {
            int sumH = 0;
            int sumV = 0;
            for (int j = 0; j < 3; j++) {
                sumH += x[i][j];
                sumV += x[j][i];
            }
            if (sumH == 3 || sumV == 3) {
                return 1;
            }
            else if (sumH == 0 || sumV == 0) {
                return 0;
            }
        }
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < 3; i++) {
            sumD1 += x[i][i];
            sumD2 += x[i][2 - i];
        }
        if (sumD1 == 3 || sumD2 == 3) {
            return 1;
        }
        else if (sumD1 == 0 || sumD2 == 0) {
            return 0;
        }
        return -1;
    }
}

/**
 * 0 0
 * 0 1
 * 0 2
 *
 * 0 0
 * 1 0
 * 2 0
 *
 * */