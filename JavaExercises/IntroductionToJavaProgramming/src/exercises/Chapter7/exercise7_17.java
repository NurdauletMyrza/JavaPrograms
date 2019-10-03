package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_17 {
    /** Sort students */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        int[] scores = new int[number];
        String[] names = new String[number];
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter name and score " + i + "-student: ");
            names[i - 1] = input.next();
            scores[i - 1] = input.nextInt();
        }
        selectionSort(scores, names);
        for (int i = number - 1; i >= 0; i--) {
            System.out.println(names[i] + " " + scores[i]);
        }
    }

    public static void selectionSort(int[] scores, String[] names) {
        for (int i = 0; i < scores.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            String name = names[i];
            int currentMin = scores[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (currentMin > scores[j]) {
                    name = names[j];
                    currentMin = scores[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                names[currentMinIndex] = names[i];
                scores[currentMinIndex] = scores[i];
                names[i] = name;
                scores[i] = currentMin;
            }
        }
    }
}
