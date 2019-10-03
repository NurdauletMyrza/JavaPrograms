package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_21 {
    /** Phone keypads */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            int number = getNumber(str.charAt(i));
            if (number == 1) {
                System.out.print(str.charAt(i));
            }
            else {
                System.out.print(number);
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {
        if (!Character.isAlphabetic(uppercaseLetter)) {
            return 1;
        }

        // Display result
        if ("ABC".contains(uppercaseLetter + "")) {
            return 2;
        }
        else if ("DEF".contains(uppercaseLetter + "")) {
            return 3;
        }
        else if ("GHI".contains(uppercaseLetter + "")) {
            return 4;
        }
        else if ("JKL".contains(uppercaseLetter + "")) {
            return 5;
        }
        else if ("MNO".contains(uppercaseLetter + "")) {
            return 6;
        }
        else if ("PQRS".contains(uppercaseLetter + "")) {
            return 7;
        }
        else if ("TUV".contains(uppercaseLetter + "")) {
            return 8;
        }
        else {
            return 9;
        }
    }
}
