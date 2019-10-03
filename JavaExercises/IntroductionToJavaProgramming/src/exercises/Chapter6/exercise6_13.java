package exercises.Chapter6;

public class exercise6_13 {
    /** Sum series */
    public static void main(String[] args) {
        System.out.printf("%-20cm(i)\n", 'i');
        for (int i = 0; i < 27; i++) {
            System.out.print("_");
        }
        for (int i = 1; i <= 20; i++) {
            System.out.printf("\n%-20d%7.4f", i, m(i));
        }
    }

    public static double m(int i) {
        double m = 0;
        for (; i > 0; i--) {
            m += (double)i / (i + 1);
        }
        return m;
    }
}
