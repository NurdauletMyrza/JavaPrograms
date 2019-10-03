package exercises.Chapter5;

public class exercise5_40 {
    /** Simulation: heads or tails */
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        for (; heads + tails < 1000000;) {
            if ((int)(Math.random() * 2) == 0)
                heads++;
            else
                tails++;
        }
        System.out.println("heads: " + heads);
        System.out.println("tails: " + tails);
    }
}
