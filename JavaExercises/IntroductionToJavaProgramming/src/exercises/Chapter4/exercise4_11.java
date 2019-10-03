package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_11 {
    /** Decimal to hex */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter integer (0 to 15)
        System.out.print("Enter a decimal value (0 to 15): ");
        byte dec = input.nextByte();
        if (!(0 <= dec && dec <= 15)) {
            System.out.println(dec + " is an invalid input");
            System.exit(1);
        }

        // Compute representation of decimal number in hexadecimal
        char ch;
        if (dec > 10)
            ch = (char)('A' + dec - 10);
        else
            ch = (char)('0' + dec);

        // Display result
        System.out.println("The hex value is " + ch);
    }
}
