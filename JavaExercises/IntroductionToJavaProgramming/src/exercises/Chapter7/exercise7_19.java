package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_19 {
    /** Sorted? */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = input.nextInt();
        }
        System.out.printf("The list is %s sorted", isSorted(list) ? "already" : "not");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
