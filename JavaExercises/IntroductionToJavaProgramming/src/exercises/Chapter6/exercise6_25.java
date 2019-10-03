package exercises.Chapter6;

public class exercise6_25 {
    /** Convert milliseconds to hours, minutes, and seconds */
    public static void main(String[] args) {
        System.out.println(convertMillis(System.currentTimeMillis() + 6 * 3600000));
        System.out.println(convertMillis(555550000));
    }

    public static String convertMillis(long millis) {
        int seconds = (int)(millis / 1000);
        int second = seconds % 60;
        int minutes = seconds / 60;
        int minute = minutes % 60;
        int hours = minutes / 60;
        return String.format("%d:%d:%d", hours, minute, second);
    }
}
