package exercises.Chapter8;

public class exercise8_4 {
    /** Compute the weekly hours for each employee */
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 4, 4},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        int[] employee = new int[hours.length];
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                employee[i] += hours[i][j];
            }
        }
        selectionSort(employee);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }

    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
