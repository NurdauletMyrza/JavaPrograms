package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_49 {
    /** Count vowels and consonants */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine().toUpperCase();
        int countVowel = 0;
        int countConsonant = 0;
        int index = 0;
        String vowels = "AEIOU";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (vowels.indexOf(letter) >= 0) {
                countVowel++;
            }
            else if (letter - 'A' >= 0 && 'Z' - letter < 26) {
                countConsonant++;
            }
        }
        System.out.println("The number of vowels is " + countVowel);
        System.out.println("The number of vowels is " + countConsonant);
    }
}
