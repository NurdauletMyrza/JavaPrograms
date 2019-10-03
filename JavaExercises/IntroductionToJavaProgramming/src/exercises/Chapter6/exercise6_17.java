package exercises.Chapter6;

public class exercise6_17 {
    /** Display matrix of 0s and 1s */
    public static void main(String[] args) {
        printMatrix(31);
    }

    public static void printMatrix(int n) {
        long randomBin;
        for (int i = 1; i <= n * n; i++) {
            randomBin = Math.round(Math.random());
            System.out.print(randomBin + " ");
            if (i % n == 0) {
                System.out.println();
            }
        }
    }
}
