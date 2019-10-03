package exercises.Chapter5;

public class exercise5_5 {
    /** Conversion from kilograms to pounds and pounds to kilograms */
    public static void main(String[] args) {
        // Display a first row of the table
        System.out.println("Kilograms\tPounds\t|\t\tPounds\t Kilograms");

        double pounds;
        double kilograms;
        for (int i = 1, j = 20; i < 200; i+=2, j+=5) {
            pounds = i * 2.2;
            kilograms = j / 2.2;
            System.out.printf("%-9d%9.1f\t| \t\t%-9d%9.2f\n", i, pounds, j, kilograms);
        }
    }
}
