package exercises.Chapter7;

public class exercise7_22 {
    /** Game: Eight Queens */
    public static void main(String[] args) {
        int[] positions = getRandomPositions();
        displayBoard(positions);
    }

    public static void displayBoard(int[] positions) {
        for (int position: positions) {
            for (int i = 1; i <= 8; i++) {
                System.out.printf("|%c", position == i ? 'Q' : ' ');
            }
            System.out.println('|');
        }
    }

    public static int[] getRandomPositions() {
        int[] positions = new int[8];
        positions[0] = (int)(Math.random() * 8) + 1;
        for (int i = 1; i < 8; i++) {
            int count = 0;
            do {
                if (20 == ++count) {
                    i--;
                    count = 0;
                }
                positions[i] = (int) (Math.random() * 8) + 1;
            } while (!isValidPosition(positions, i));
        }
        return positions;
    }

    public static boolean isValidPosition(int[] positions, int p) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] == positions[p] && i != p) {
                return false;
            }
        }
        return Math.abs(positions[p] - positions[p - 1]) > 1;
    }
}
