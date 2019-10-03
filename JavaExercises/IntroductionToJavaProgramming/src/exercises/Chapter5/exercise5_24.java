package exercises.Chapter5;

public class exercise5_24 {
    /** Sum a series */
    public static void main(String[] args) {
        double division = 1;
        double sum = 0;
        for (double n = 99; n > 0; n-=2) {
            division = 1 - 2 / n;
            sum += division;
            System.out.print(division + " " + n + "\n");
        }
        System.out.println("\nThe sum: " + sum);
    }
}
