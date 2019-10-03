package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_44 {
    /** Computer architecture: bit-level operations */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter integer
        System.out.print("Enter an integer: ");
        short number = input.nextShort();



        String bitResult = Integer.toBinaryString(number);
        if (number >= 0) {
            for (int i = 0; i < 16 - bitResult.length(); i++) {
                System.out.print(0);
            }
        }
        else {
            bitResult = bitResult.substring(16);
        }
        System.out.println(bitResult);
    }
}
