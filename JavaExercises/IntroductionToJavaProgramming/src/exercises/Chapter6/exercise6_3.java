package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_3 {
    /** Palindrome Integer */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("The reverse of " + number + " is " + reverse(number));
        System.out.println("The number " + number + " is Palindrome? " + isPalindrome(number));
    }

    /** Return the reversal of an integer, i.e., reverse(456) returns 654 */
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    /** Return true if number is a palindrome */
    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }
}
