package exercises.Chapter5;

public class exercise5_18 {
    /** Display four patterns using loops */
    public static void main(String[] args) {
        String p1 = "", p2 = "", p3 = "", p4 = "";
        System.out.printf("%-18s%-18s%-18s%-18s\n", "Pattern A", "Pattern B", "Pattern C", "Pattern D");
        for (int i = 1; i <= 6; i++) {
            // Pattern A
            for (int j = 1; j <= i; j++) {
                p1 += j + " ";
            }

            // Pattern B
            for (int j = 1; j <= 7 - i; j++) {
                p2 += j + " ";
            }

            // Pattern C
            for (int j = 6; j > 0; j--) {
                if (j <= i)
                    p3 += j + " ";
                else
                    p3 += "  ";
            }

            // Pattern D
            for (int j = 1; j <= 6; j++) {
                if (j == i) {
                    for (j = 1; j <= 7 - i; j++) {
                        p4 += j + " ";
                    }
                    break;
                }
                else
                    p4 += "  ";
            }
            System.out.printf("%-18s%-18s%-18s%-18s\n", p1, p2, p3, p4);
            p1 = ""; p2 = ""; p3 = ""; p4 = "";
        }
    }
}
