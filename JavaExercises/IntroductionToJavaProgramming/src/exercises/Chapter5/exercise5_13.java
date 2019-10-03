package exercises.Chapter5;

public class exercise5_13 {
    /** Find the largest n such that n^3 < 12,000 */
    public static void main(String[] args) {
        int n = 1;
        while (n * n * n < 12000) {
            n++;
        }
        System.out.println(n - 1);
    }
}
