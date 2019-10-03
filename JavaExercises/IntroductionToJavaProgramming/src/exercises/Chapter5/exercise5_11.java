package exercises.Chapter5;

public class exercise5_11 {
    /** Find numbers divisible by 5 and 6, but not both */
    public static void main(String[] args) {
        for (int i = 100, count = 0; i <= 200; i++) {
            if (count == 10){
                System.out.println();
                count = 0;
            }
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
