package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_4 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The reverse of number " + n + " is " + reverse(n));
    }

    /** Display an integer reversed */
    public static int reverse(int n) {
        return exercise6_3.reverse(n);
    }
}
