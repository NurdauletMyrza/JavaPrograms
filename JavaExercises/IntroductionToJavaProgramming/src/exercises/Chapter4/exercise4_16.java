package exercises.Chapter4;

public class exercise4_16 {
    /** Random character */
    public static void main(String[] args) {
        // Generate random number [0, 25]
        int random25 = (int)(Math.random() * 26);

        // Compute new uppercase letter
        char ch = (char)('A' + random25);

        // Display result
        System.out.println("Random uppercase letter: " + ch);
    }
}
