package exercises.Chapter6;

public class exercise6_22 {
    /** Math: approximate the square root */
    public static void main(String[] args) {
        System.out.println(sqrt(0L));
    }

    public static double sqrt(long n) {
        double lastGuess = n - 1;
        double nextGuess = n;
        while (Math.abs(lastGuess - nextGuess) < 1E-20) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
