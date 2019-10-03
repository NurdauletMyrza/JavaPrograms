package exercises.Chapter7;

public class exercise7_12 {
    /** Reverse an array */
    public static void main(String[] args) {

    }

    public static int[] reverse(int[] numbers) {
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[reverse.length - 1 - i] = numbers[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] numbers) {
        double[] reverse = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[reverse.length - 1 - i] = numbers[i];
        }
        return reverse;
    }
}
