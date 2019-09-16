package exercises.Chapter2;

import java.util.Scanner;

/** Current time */
public class Exercise8 {
    public static void main(String[] args) {
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone =  new Scanner(System.in).nextInt();
        long seconds = System.currentTimeMillis() / 1000;
        int minutes = (int)(seconds / 60);
        seconds %= 60;
        int hours = (minutes / 60 + timeZone) % 24;
        minutes %= 60;
        System.out.printf("The current time is %02d:%02d:%02d", hours, minutes, seconds);
    }
}
