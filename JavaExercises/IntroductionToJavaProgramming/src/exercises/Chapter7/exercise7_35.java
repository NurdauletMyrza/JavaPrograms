package exercises.Chapter7;

import java.util.Scanner;

public class exercise7_35 {
    /** Game: hangman */
    public static void main(String[] args) {
        char x;
        do {
            Scanner input = new Scanner(System.in);
            String[] words = {"write", "that", "Nurdaulet", "JAVA"};
            String word = randomChoose(words);
            System.out.println(word);
            String[] wordGuess = word.split("");
            String[] finded = new String[wordGuess.length];
            for (int i = 0; i < finded.length; i++) {
                finded[i] = "*";
            }
            int count = 0;
            while (!equal(wordGuess, finded)) {
                System.out.print("(Guess) Enter a letter in word " + String.join("", finded) + " > ");
                String letter = input.next();
                if (contain(finded, letter)) {
                    System.out.println(letter + " is already in the word");
                } else if (!contain(wordGuess, letter)) {
                    count++;
                    System.out.println(letter + " is not in the word");
                } else {
                    addFinded(wordGuess, finded, letter);
                }
            }
            System.out.println("The word is " + word + ". You missed " + count + " time");
            System.out.print("Do you want to guess another word? Enter y or n > ");
            x = input.next().charAt(0);
        } while (x == 'y');
    }

    public static String randomChoose(String[] words) {
        return words[(int)(words.length * Math.random())];
    }

    public static boolean equal(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].toLowerCase().equals(s2[i].toLowerCase())) {return false;}
        }
        return true;
    }

    public static boolean contain(String[] list, String s) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].toLowerCase().equals(s.toLowerCase())) {return true;}
        }
        return false;
    }

    public static void addFinded(String[] word, String[] finded, String s) {
        for (int i = 0; i < word.length; i++) {
            if (word[i].toLowerCase().equals(s.toLowerCase())) {
                finded[i] = word[i];
            }
        }
    }
}
