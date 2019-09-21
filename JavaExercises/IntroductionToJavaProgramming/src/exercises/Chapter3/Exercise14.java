package exercises.Chapter3;

/** Game: heads or tails */
public class Exercise14 {
    public static void main(String[] args) {
        // Prompt the user to enter 1 or 0
        System.out.print("Enter 0 or 1: ");
        byte guess = new java.util.Scanner(System.in).nextByte();

        // Generate random integer(0 or 1)
        byte randomInteger = (byte) (Math.random() * 2);

        if (randomInteger == guess)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
