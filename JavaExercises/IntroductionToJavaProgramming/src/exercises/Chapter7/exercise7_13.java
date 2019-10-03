package exercises.Chapter7;

public class exercise7_13 {
    /** Random number chooser */
    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 4, 5));
    }

    public static int getRandom(int... numbers) {
        int randomIndex = (int)(Math.random() * numbers.length);
        return numbers[randomIndex];
    }
}
