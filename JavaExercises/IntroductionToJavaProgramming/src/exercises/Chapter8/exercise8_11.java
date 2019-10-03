package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_11 {
    /** Game: nine heads and tails */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] coins = new boolean[3][3];
        System.out.print("Enter a number between 0 and 511: ");
        getCombination(coins, input.nextInt());
        System.out.println("result");
        for (boolean[] list: coins) {
            for (boolean coin: list) {
                System.out.print(coin ? "T " : "H ");
            }
            System.out.println();
        }
    }

    public static void getCombination(boolean[][] coins, int n) {
        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;
            while (coins[x][y]) {
                for (int j = 0; j < coins.length; j++) {
                    int k;
                    for (k = 0; k < coins[j].length; k++) {
                        coins[j][k] = !coins[x][y];
                        if (x == j && y == k) {
                            break;
                        }
                    }
                    if (x == j && y == k) {
                        break;
                    }
                }
                y++;
                if (y == 3) {
                    y = 0;
                    x++;
                }
            }
            System.out.println(i);
            coins[x][y] = !coins[x][y];
            for (boolean[] list: coins) {
                for (boolean coin: list) {
                    System.out.print(coin ? "T " : "H ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
