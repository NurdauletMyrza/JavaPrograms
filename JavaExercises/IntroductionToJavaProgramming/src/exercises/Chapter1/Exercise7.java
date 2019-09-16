package exercises.Chapter1;

/** Approximate Pi */
public class Exercise7 {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 0; i < 10000; i++) {
            pi += 4 * Math.pow(-1, i) / (i * 2 + 1);
        }
        System.out.println(pi);
    }
}
