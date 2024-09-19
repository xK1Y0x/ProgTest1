import java.util.Random;

public class War3 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i % 13 + 1; // Assign values 1 to 13
        }

        int playerWins = 0, computerWins = 0, ties = 0;
        Random rand = new Random();

        while (deck.length > 0) {
            // Player's turn
            int playerIndex = rand.nextInt(deck.length);
            int playerCard = deck[playerIndex];
            System.out.println("Player draws: " + playerCard);

            // Remove the player's card from the deck
            deck = removeCard(deck, playerIndex);

            // Computer's turn
            int computerIndex = rand.nextInt(deck.length);
            int computerCard = deck[computerIndex];
            System.out.println("Computer draws: " + computerCard);

            // Remove the computer's card from the deck
            deck = removeCard(deck, computerIndex);

            // Compare cards
            if (playerCard > computerCard) {
                System.out.println("Player wins this round!\n");
                playerWins++;
            } else if (computerCard > playerCard) {
                System.out.println("Computer wins this round!\n");
                computerWins++;
            } else {
                System.out.println("It's a tie!\n");
                ties++;
            }
        }

        // Display final counts
        System.out.println("Final Results:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
    }

    private static int[] removeCard(int[] deck, int index) {
        int[] newDeck = new int[deck.length - 1];
        for (int i = 0, j = 0; i < deck.length; i++) {
            if (i != index) {
                newDeck[j++] = deck[i];
            }
        }
        return newDeck;
    }
}
