package exercises.Chapter3;

/** Current time */
public class Exercise30 {
    public static void main(String[] args) {
        // Prompt to declare and assign time zone
        System.out.print("Enter the time zone offset to GMT: ");
        byte timeZone = new java.util.Scanner(System.in).nextByte();

        // Computes current time
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        byte currentSecond = (byte)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        byte currentMinute = (byte)(totalMinutes % 60);
        long totalHour = totalMinutes / 60;
        byte currentHour = (byte)((totalHour + timeZone) % 24);

        // Display the current time
        System.out.printf("The current time is %02d:%02d:%02d %s", (currentHour % 12 == 0) ? 12 : currentHour % 12, currentMinute, currentSecond, (currentHour < 12) ? "AM" : "PM");
    }
}
