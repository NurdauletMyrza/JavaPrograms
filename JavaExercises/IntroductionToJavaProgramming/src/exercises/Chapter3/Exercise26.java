package exercises.Chapter3;

/** Use the &&, || and ^ operators */
public class Exercise26 {
    public static void main(String[] args) {
        // Prompt the user to enter number
        System.out.print("Enter in integer: ");
        int number = new java.util.Scanner(System.in).nextInt();

        // Display result
        System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}
