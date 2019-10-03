package exercises.Chapter5;

public class exercise5_3 {
    /** Conversion from kilograms to pounds */
    public static void main(String[] args) {
        // Display a first row of the table
        System.out.println("Kilograms     Pounds");

        double pounds;
        for (int i = 1; i < 200; i+=2) {
            pounds = i * 2.2;
            System.out.printf("%-10d%10.1f\n", i, pounds);
        }
    }
}
