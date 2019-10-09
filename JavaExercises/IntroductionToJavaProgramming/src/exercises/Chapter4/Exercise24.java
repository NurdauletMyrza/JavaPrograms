package exercises.Chapter4;
import java.util.Scanner;

public class Exercise24 {
    /** Order three cities */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // Compute order
        String temp;
        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }

        // Display result
        System.out.printf("The three cities is Alphabetical order are %s %s %s", city1, city2, city3);
    }
}
