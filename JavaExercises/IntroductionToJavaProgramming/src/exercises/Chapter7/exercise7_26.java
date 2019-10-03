package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_26 {
    /** Strictly identical arrays */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[] list1 = new int[6];
        for (int i = 0; i < 6; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int[] list2 = new int[6];
        for (int i = 0; i < 6; i++) {
            list2[i] = input.nextInt();
        }

        System.out.printf("Two lists are%s strictly identical", equals(list1, list2) ? "" : " not");
    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
