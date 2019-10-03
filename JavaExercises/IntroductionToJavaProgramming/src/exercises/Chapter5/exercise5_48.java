package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_48 {
    /** Process string */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
