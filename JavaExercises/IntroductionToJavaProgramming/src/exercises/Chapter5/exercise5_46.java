package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_46 {
    /** Reverse a string */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.substring(i, i + 1).concat(reverse);
        }
        System.out.println("The reversed string is " + reverse);
    }
}
