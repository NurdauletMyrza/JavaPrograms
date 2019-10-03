package exercises.Chapter5;

public class exercise5_35 {
    /** Summation */
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 625; i > 1;) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(--i));
        }
        System.out.println(sum);
    }
}
