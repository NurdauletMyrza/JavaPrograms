package exercises.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_31 {
    /** Merge two sorted lists */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int length = input.nextInt();
        int[] list1 = new int[length];
        for (int i = 0; i < length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        length = input.nextInt();
        int[] list2 = new int[length];
        for (int i = 0; i < length; i++) {
            list2[i] = input.nextInt();
        }
        System.out.println("The merged list is " + Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, list, 0, list1.length);
        System.arraycopy(list2, 0, list, list1.length, list2.length);
        selectionSort(list);
        return list;
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
