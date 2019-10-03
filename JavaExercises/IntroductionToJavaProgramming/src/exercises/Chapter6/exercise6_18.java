package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_18 {
    /** Check password */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        checkPassword(input.next());
    }

    public static void checkPassword(String password) {
        System.out.printf("%salid Password", (is8CharacterLong(password) && isContain2Digits(password) && isLetterDigit(password)) ? "V" : "Inv");
    }
    public static boolean is8CharacterLong(String password) {
        return password.length() == 8;
    }
    public static boolean isLetterDigit(String password) {
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isContain2Digits(String password) {
        char ch;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (!Character.isDigit(ch)) {
                count++;
            }
        }
        return count > 1;
    }
}
