package exercises.Chapter6;

public class exercise6_30 {
    /** Game: craps */
    public static void main(String[] args) {
        int sum = rollDice();
        if (isCraps(sum)) {
            System.out.println("You lose");
        }
        else if (isNatural(sum)) {
            System.out.println("You win");
        }
        else {
            System.out.println("point is " + sum);
            int point = sum;
            sum = rollDice();
            while (true) {
                if (point == sum) {
                    System.out.println("You win");
                }
                else if (sum == 7) {
                    System.out.println("You lose");
                }
                else {
                    sum = rollDice();
                    continue;
                }
                break;
            }
        }
    }

    public static int rollDice() {
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, dice1 + dice2);
        return dice1 + dice2;
    }

    public static boolean isCraps(int sum) {
        return sum == 2 || sum == 3 || sum == 12;
    }

    public static boolean isNatural(int sum) {
        return sum == 7 || sum == 11;
    }
}
