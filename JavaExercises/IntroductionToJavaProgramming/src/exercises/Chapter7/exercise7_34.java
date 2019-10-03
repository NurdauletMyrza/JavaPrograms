package exercises.Chapter7;

import java.util.Arrays;

public class exercise7_34 {
    /** Sort characters in a string */
    public static void main(String[] args) {
        String sorted = sort("ACB");
        System.out.println(sorted);
    }

    public static String sort(String s) {
        String[] str = s.split("");
        selectionSort(str);
        return String.join("", str);
    }

    public static void selectionSort(String[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            String currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
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
