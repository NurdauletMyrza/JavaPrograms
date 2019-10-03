package exercises.Chapter5;

public class exercise5_26 {
    /** Compute e */
    public static void main(String[] args) {
        // Compute long time (so many loops)
        for (int n = 10_000; n <= 100_000; n += 10_000) {
            double e = 1;
            for (int i = n; i > 0; i--) {
                double factorial_i = 1;
                int index = i;
                while (index != 0) {
                    factorial_i *= index--;
                }
                e += 1 / factorial_i;
            }

            // Display result e
            System.out.println(e);
        }

        // Compute faster
        for (int n = 10_000; n <= 100_000; n += 10_000) {
            // Compute e
            double division = 1;
            double e = 1;
            for (int i = 1; i <= n; i++) {
                division /= i;
                e += division;
            }

            // Display result
            System.out.println(e);
        }
    }
}
