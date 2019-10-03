package exercises.Chapter4;

public class exercise4_25 {
    /** Generate vehicle plate number */
    public static void main(String[] args) {
        // Generate random 4 digit integer
        // Generate random 3 uppercase letters
        int numbers = (int)(Math.random() * 9 + 1);
        String letters = "";
        char letter = 'A';
        for (int i = 0; i < 3; i++) {
            numbers = numbers * 10 + (int)(Math.random() * 10);
            letters += (char)(letter + Math.random() * 25);
        }

        // Display result
        System.out.printf("%d %s", numbers, letters);
    }
}
