package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_37 {
    /** Decimal to binary */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int binary = 0;
        int index = 0;
        do {
            binary += decimal % 2 * Math.pow(10, index++);
            decimal /= 2;
        } while (decimal > 0);
        System.out.println(binary);
    }
}
