package exercises.Chapter5;

public class exercise5_4 {
    /** Conversion from miles to kilometers */
    public static void main(String[] args) {
        // Display a first row of the table
        System.out.println("Miles     Kilometers");

        double kilometers;
        for (int i = 1; i <= 10; i++) {
            kilometers = i * 1.609;
            System.out.printf("%-10d%10.3f\n", i, kilometers);
        }
    }
}
