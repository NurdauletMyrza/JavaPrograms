package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_50 {
    /** Count uppercase letters */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int count = Character.isUpperCase(str.charAt(0)) ? 1 : 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && Character.isUpperCase(str.charAt(i + 1))) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
