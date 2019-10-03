package exercises.Chapter8;

public class exercise8_10 {
    /** Largest row and column */
    public static void main(String[] args) {
        int[][] m;
        printMatrix(m = createBinaryMatrix());
        System.out.println("The largest row index: " + largestRow(m));
        System.out.println("The largest column index: " + largestColumn(m));
    }

    public static int[][] createBinaryMatrix() {
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 2);
            }
        }
        return m;
    }

    public static void printMatrix(int[][] m) {
        for (int[] list: m) {
            for (int number: list) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static int largestColumn(int[][] m) {
        int[] columns = new int[m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                columns[j] += m[i][j];
            }
        }

        int max = columns[0];
        int index = 0;
        for (int i = 0; i < columns.length; i++) {
            if (max < columns[i]) {
                index = i;
                max = columns[i];
            }
        }

        return index;
    }

    public static int largestRow(int[][] m) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int number: m[i]) {
                sum += number;
            }
            if (max < sum) {
                index = i;
                max = sum;
            }
        }
        return index;
    }
}
