package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_38 {
    /** Decimal to octal */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int octal = 0;
        int index = 0;
        do {
            octal += decimal % 8 * Math.pow(10, index++);
            decimal /= 8;
        } while (decimal > 0);
        System.out.println(octal);
    }
}
