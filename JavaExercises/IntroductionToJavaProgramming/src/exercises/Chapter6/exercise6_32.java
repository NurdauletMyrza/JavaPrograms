package exercises.Chapter6;

public class exercise6_32 {
    /** Game: chance of winning at craps */
    public static void main(String[] args) {
        int countWin = 0;
        for (int i = 0; i < 10_000; i++) {
            int sum = rollDice();
            if (isCraps(sum)) {
                continue;
            }
            else if (isNatural(sum)) {
                countWin++;
            }
            else {
                int point = sum;
                sum = rollDice();
                while (true) {
                    if (point == sum) {
                        countWin++;
                    }
                    else if (sum == 7) {
                        break;
                    }
                    else {
                        sum = rollDice();
                        continue;
                    }
                    break;
                }
            }
        }
        System.out.printf("Your wins %d/10000", countWin);
    }

    public static int rollDice() {
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        return dice1 + dice2;
    }

    public static boolean isCraps(int sum) {
        return sum == 2 || sum == 3 || sum == 12;
    }

    public static boolean isNatural(int sum) {
        return sum == 7 || sum == 11;
    }
}
