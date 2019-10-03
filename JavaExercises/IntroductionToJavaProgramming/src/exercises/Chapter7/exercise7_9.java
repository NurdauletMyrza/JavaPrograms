package exercises.Chapter7;

public class exercise7_9 {
    /** Find teh smallest element */
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3, 4, 5, 6, 7, 8, 0, 9, 11, -2, 9));
    }

    public static double min(double... array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
