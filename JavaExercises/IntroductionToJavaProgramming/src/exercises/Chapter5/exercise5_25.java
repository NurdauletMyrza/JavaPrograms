package exercises.Chapter5;

public class exercise5_25 {
    /** Compute pi */
    public static void main(String[] args) {
        for (int n = 10_000; n <= 100_000; n += 10_000) {
            // Compute pi
            double pi = 0;
            for (int i = 1; i <= n; i++) {
                double division = Math.pow(-1, i + 1) / (2 * i - 1);
                pi += 4 * division;
            }

            // Display value of n times pi
            System.out.println(pi);
        }
    }
}
