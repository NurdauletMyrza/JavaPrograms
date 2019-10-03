package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_21 {
    /** Game: bean machine */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int[] slots = new int[input.nextInt()];
        play(balls, slots);
    }

    public static void play(int balls, int[] slots) {
        for (int i = 0; i < balls; i++) {
            int sum = 0;
            int path;
            for (int j = 0; j < slots.length - 1; j++) {
                path = (int)(Math.random() * 2);    // 0 left, 1 right
                sum += path;
                System.out.print(path == 0 ? "L" : "R");
            }
            System.out.println();
            slots[sum]++;
        }
        displayPosition(slots);
    }

    public static void displayPosition(int[] slots) {

        for (int i = max(slots); i > 0; i--) {
            for (int slot = 0; slot < slots.length; slot++) {
                System.out.print('|');
                if (slots[slot] >= i) {
                    System.out.print(0);
                }
                else {
                    System.out.print(" ");
                }
                System.out.print('|');
            }
            System.out.println();
        }
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}
