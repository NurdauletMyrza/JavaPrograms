package exercises.Chapter7;

public class exercise7_10 {
    /** Find the index of the smallest element */
    public static void main(String[] args) {
        System.out.println(indexOfSmallestElement(0, 3, 4.0, 5, -1, 1));
    }

    public static int indexOfSmallestElement(double... array) {
        int index = 0;
        double min = array[index];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
