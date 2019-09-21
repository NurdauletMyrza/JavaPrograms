package exercises.Chapter3;

/** Palindrome number */
public class Exercise12 {
    public static void main(String[] args) {
        // Prompt the user to enter three-digit number
        System.out.print("Enter a three-digit integer: ");
        int number = new java.util.Scanner(System.in).nextInt();

        // Check palindrome and display result
        System.out.print(number + " is ");
        if (number / 100 != number % 10)
            System.out.print("not ");
        System.out.print("a palindrome");
    }
}
