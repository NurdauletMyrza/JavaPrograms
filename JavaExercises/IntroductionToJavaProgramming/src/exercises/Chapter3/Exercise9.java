package exercises.Chapter3;

/** Business: check ISBN-10 */
public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int nineDigits = new java.util.Scanner(System.in).nextInt();
        int digits = nineDigits;

        // Compute each digit
        byte digit9 = (byte)(digits % 10);
        digits /= 10;
        byte digit8 = (byte)(digits % 10);
        digits /= 10;
        byte digit7 = (byte)(digits % 10);
        digits /= 10;
        byte digit6 = (byte)(digits % 10);
        digits /= 10;
        byte digit5 = (byte)(digits % 10);
        digits /= 10;
        byte digit4 = (byte)(digits % 10);
        digits /= 10;
        byte digit3 = (byte)(digits % 10);
        digits /= 10;
        byte digit2 = (byte)(digits % 10);
        digits /= 10;
        byte digit1 = (byte)digits;

        // Compute 10-digit
        byte digit10 = (byte)((digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11);

        // Display the ISBN-10 number
        System.out.print(nineDigits);
        if (digit10 == 10)
            System.out.print("X");
        else
            System.out.print(digit10);
    }
}
