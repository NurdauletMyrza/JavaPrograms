package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_33 {
    /** Culture: Chinese Zodiac */
    public static void main(String[] args) {
        // Create the Scanner
        Scanner input = new Scanner(System.in);

        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        // Prompt the user to enter year
        System.out.print("Enter a year: ");
        System.out.println(zodiac[input.nextInt() - 1]);
    }
}
