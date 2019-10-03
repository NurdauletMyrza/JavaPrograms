package exercises.Chapter5;

public class exercise5_15 {
    /** Display the ASCII character table */
    public static void main(String[] args) {
        final int CHARACTER_PER_LINE = 10;
        char ch = '!';
        for (int count = 1; ch <= '~'; ch += 1, count++) {
            System.out.print(ch + " ");
            if (count % CHARACTER_PER_LINE == 0)
                System.out.println();
        }
    }
}
