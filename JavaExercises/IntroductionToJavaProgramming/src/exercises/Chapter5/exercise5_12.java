package exercises.Chapter5;

public class exercise5_12 {
    /** Find the smallest n such that n^2 > 12,000 */
    public static void main(String[] args) {
        int n = 1;
        while (n * n <= 12_000) {
            n++;
        }
        System.out.println(n);
    }
}
