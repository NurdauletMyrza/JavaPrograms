package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_20 {
    /** Count the letter in a string */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some String: ");
        System.out.println("letters in the string: " + countLetters(input.nextLine()));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
