package exercises.Chapter5;

public class exercise5_23 {
    /** Demonstrate cancellation errors */
    public static void main(String[] args) {
        // Assign some values
        int n = 50_000;
        double sum = 0;

        // Compute the sum
        for (int i = n; i > 0; i--) {
            sum += 1.0/i;
        }

        // Display result
        System.out.println("The result of sum is " + sum);

        // Assign some values
        n = 50_000;
        sum = 0;

        // Compute the sum
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }

        // Display result
        System.out.println("The result of sum is " + sum);
    }
}
