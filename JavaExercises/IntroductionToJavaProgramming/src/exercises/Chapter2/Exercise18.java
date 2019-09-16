package exercises.Chapter2;

/** Print a table */
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        System.out.printf("%d\t%d\t%d\n", 1, 2, (int)Math.pow(1, 2));
        System.out.printf("%d\t%d\t%d\n", 2, 3, (int)Math.pow(2, 3));
        System.out.printf("%d\t%d\t%d\n", 3, 4, (int)Math.pow(3, 4));
        System.out.printf("%d\t%d\t%d\n", 4, 5, (int)Math.pow(4, 5));
        System.out.printf("%d\t%d\t%d\n", 5, 6, (int)Math.pow(5, 6));
    }
}
