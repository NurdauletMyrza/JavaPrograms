package exercises.Chapter1;

/** Print a table */
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d\t%d\t%d\n", i, i * i, i * i * i);
        }
    }
}
