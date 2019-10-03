package exercises.Chapter5;

public class exercise5_43 {
    /** Math: combinations */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                count++;
                System.out.println(i + " " + j);
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
