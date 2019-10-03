package exercises.Chapter7;

public class exercise7_24 {
    /** Simulation: coupon collector's problem */
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] result = {-1, -1, -1, -1};
        int count = 0;

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        while (result[0] == -1 || result[1] == -1 || result[2] == -1 || result[3] == -1) {
            // Shuffle the cards
            for (int i = 0; i < deck.length; i++) {
                // Generate an index randomly
                int index = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }

            int card = deck[0];
            int suit = card / 13;
            int rank = card % 13;
            if (result[suit] == -1) {
                result[suit] = rank;
                // Display the result
                System.out.println(ranks[rank] + " of " + suits[suit]);
            }
            count++;
        }
        System.out.println("Number of picks: " + count);
    }
}
