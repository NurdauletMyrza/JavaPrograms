package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_51 {
    /** Longest common prefix */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        int length = str1.length();
        if (length > str2.length()) {
            length = str2.length();
        }
        int i = 0;
        for (; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
        }
        if (i == 0) {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        }
        else {
            System.out.println("The common prefix is " + str1.substring(0,i));
        }
    }
}
