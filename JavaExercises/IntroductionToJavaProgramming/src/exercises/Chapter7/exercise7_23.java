package exercises.Chapter7;

public class exercise7_23 {
    /** Game: locker puzzle */
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        int j;
        for (int i = 0; i < lockers.length; i++) {
            j = i;
            while (j < lockers.length) {
                lockers[j] = !lockers[j];
                j = j + i + 1;
            }
        }
        System.out.println("The open lockers are: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
