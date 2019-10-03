package exercises.Chapter8;

import java.util.Arrays;

/** Shuffle rows */
public class exercise8_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        for (int[] list: m) {
            System.out.println(Arrays.toString(list));
        }
    }

    private static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int index = (int)(Math.random() * m.length);
            int[] list = m[index];
            m[index] = m[i];
            m[i] = list;
        }
    }
}
