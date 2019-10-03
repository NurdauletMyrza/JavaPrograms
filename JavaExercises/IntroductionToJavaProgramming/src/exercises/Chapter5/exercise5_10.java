package exercises.Chapter5;

public class exercise5_10 {
    /** Find numbers divisible by 5 and 6 */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (count == 10){
                System.out.println();
                count = 0;
            }
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
