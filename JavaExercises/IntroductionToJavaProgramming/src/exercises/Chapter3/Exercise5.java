package exercises.Chapter3;

/** Find future dates */
public class Exercise5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int days = input.nextInt();
        String day1, day2;
        switch (today) {
            case 0: day1 = "Sunday"; break;
            case 1: day1 = "Monday"; break;
            case 2: day1 = "Tuesday"; break;
            case 3: day1 = "Wednesday"; break;
            case 4: day1 = "Thursday"; break;
            case 5: day1 = "Friday"; break;
            case 6: day1 = "Saturday"; break;
            default: day1 = "todayNotFound";
        }
        switch ((today + days) % 7) {
            case 0: day2 = "Sunday"; break;
            case 1: day2 = "Monday"; break;
            case 2: day2 = "Tuesday"; break;
            case 3: day2 = "Wednesday"; break;
            case 4: day2 = "Thursday"; break;
            case 5: day2 = "Friday"; break;
            case 6: day2 = "Saturday"; break;
            default: day2 = "futureDayNotFound";
        }
        System.out.printf("Today is %s and the future day is %s", day1, day2);
    }
}
