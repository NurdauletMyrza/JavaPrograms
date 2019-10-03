package exercises.Chapter7;

public class exercise7_7 {
    /** Counts single digits */
    public static void main(String[] args) {
        int randomDigit;
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            randomDigit = intRandom(0, 9);
            counts[randomDigit]++;
        }

        // Display result
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digit %d is %d times\n", i, counts[i]);
        }
    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
    }
}
