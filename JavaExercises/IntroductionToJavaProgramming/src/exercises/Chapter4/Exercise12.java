package exercises.Chapter4;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        // Prompt the user to enter hex digit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display result
        char ch = hexString.charAt(0);
        String binary;
        if (ch <= 'F' && ch >= 'A') {
            int decimal = ch - 'A' + 10;
            binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is: " + binary);
        }
        else if (Character.isDigit(ch)){
            int decimal = ch - '1' + 1;
            binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is: " + binary);
        }
        else {
            System.out.println(ch + " is an invalid input");
            System.exit(1);
        }
    }
}
