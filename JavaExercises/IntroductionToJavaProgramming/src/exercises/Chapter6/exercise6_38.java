package exercises.Chapter6;

public class exercise6_38 {
    /** Generate random characters */
    public static void main(String[] args) {
        final int PER_LINE = 10;
        for (int i = 1; i <= 100; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
            if (i % PER_LINE == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
            if (i % PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}
