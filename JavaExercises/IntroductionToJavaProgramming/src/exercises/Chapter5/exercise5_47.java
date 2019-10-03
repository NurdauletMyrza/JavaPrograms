package exercises.Chapter5;

import java.util.Scanner;

public class exercise5_47 {
    /** Business: check ISBN-13 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String numbers = input.next();
        if (numbers.length() != 12) {
            System.out.println(numbers + " is an invalid input");
            System.exit(1);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            sum += Integer.parseInt(numbers.substring(i, i + 1)) * Math.pow(3, i % 2);
        }
        int lastDigit = 10 - sum % 10;
        System.out.println("The ISBN-13 number is " + numbers + lastDigit % 10);
    }
}
