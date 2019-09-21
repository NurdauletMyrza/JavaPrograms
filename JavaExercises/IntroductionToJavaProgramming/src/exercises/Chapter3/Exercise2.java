package exercises.Chapter3;

/** Game: add three numbers */
public class Exercise2 {
    public static void main(String[] args) {
        long random = System.currentTimeMillis();
        int num1 = (int)(random % 10);
        random /= 10;
        int num2 = (int)(random % 10);
        random /= 10;
        int num3 = (int)(random % 10);
//        int num1 = (int)(Math.random() * 10);
//        int num2 = (int)(Math.random() * 10);
//        int num3 = (int)(Math.random() * 10);
        System.out.printf("%d + %d + %d = ", num1, num2, num3);
        System.out.println((new java.util.Scanner(System.in).nextInt() == num1 + num2 + num3) ? "You are right!" : String.format("mistake!!! result must be: %d", num1 + num2 + num3));
    }
}
