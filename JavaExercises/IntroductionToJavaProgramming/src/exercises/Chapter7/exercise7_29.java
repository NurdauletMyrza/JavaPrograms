package exercises.Chapter7;

public class exercise7_29 {
    /** Game: pick four cards */
    public static void main(String[] args) {
        int[] deck = new int[52];
        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        int count = 0;

        for (int i1 = 0; i1 < deck.length; i1++) {
            for (int i2 = 0; i2 < deck.length; i2++) {
                if (i1 == i2)
                    continue;
                for (int i3 = 0; i3 < deck.length; i3++) {
                    if (i1 == i3 || i2 == i3)
                        continue;
                    for (int i4 = 0; i4 < deck.length; i4++) {
                        if (i1 == i4 || i2 == i4 || i3 == i4)
                            continue;
                        if (sumOfCards(i1, i2, i3, i4, 24)) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean sumOfCards(int i1, int i2, int i3, int i4, int sum) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int suit1 = i1 / 13;
        int suit2 = i2 / 13;
        int suit3 = i3 / 13;
        int suit4 = i4 / 13;
        int rank1 = i1 % 13;
        int rank2 = i2 % 13;
        int rank3 = i3 % 13;
        int rank4 = i4 % 13;

        if (sum - 4 - rank1 - rank2 - rank3 - rank4 == 0) {
            System.out.printf("%s %s|%s %s|%s %s|%s %s\n", suits[suit1], ranks[rank1], suits[suit2], ranks[rank2], suits[suit3], ranks[rank3], suits[suit4], ranks[rank4]);
            return true;
        }

        return false;
    }
}
