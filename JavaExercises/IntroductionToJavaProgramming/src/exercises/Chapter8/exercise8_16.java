package exercises.Chapter8;

/** Sort two-dimensional array */
public class exercise8_16 {
    public static void main(String[] args) {
        int[][] numbers = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(numbers);
        for (int[] list: numbers) {
            for (int number: list) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    public static void sort(int m[][]) {
        for (int i = 0; i < m.length - 1; i++) {
            int min0 = m[i][0];
            int min1 = m[i][1];
            int index = i;
            for (int j = i + 1; j < m.length; j++) {
                if (min0 > m[j][0] || (min0 == m[j][0] && min1 > m[j][1])) {
                    min0 = m[j][0];
                    min1 = m[j][1];
                    index = j;
                }
            }
            int num0 = m[i][0];
            int num1 = m[i][1];
            m[i][0] = min0;
            m[i][1] = min1;
            m[index][0] = num0;
            m[index][1] = num1;
        }
    }
}
