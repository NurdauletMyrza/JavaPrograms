package exercises.Chapter2;

import java.util.Scanner;

/** Financial application: calculate tips */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double grate = input.nextDouble();
        System.out.printf("The gratuity is $1.5 and total is $%f", subtotal * (1 + grate / 100));
    }
}
