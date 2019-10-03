package exercises.Chapter5;

public class exercise5_6 {
    /** Conversion from miles to kilometers */
    public static void main(String[] args) {
        // Display a first row of the table
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

        double kilometers;
        double miles;
        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            kilometers = i * 1.609;
            miles = j / 1.609;
            System.out.printf("%-8d%-10.3f\t|\t%-12d%-9.3f\n", i, kilometers, j, miles);
        }
    }
}
