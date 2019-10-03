package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_27 {
    /** Identical arrays */
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
        selectionSort(list1);
        selectionSort(list2);


        System.out.printf("Two lists are%s identical", equals(list1, list2) ? "" : " not");
    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
