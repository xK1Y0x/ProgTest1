import java.util.Random;

class Die {
    private int value;

    public Die() {
        value = 1 + (int)(Math.random() * 6);
    }

    public int getValue() {
        return value;
    }
}

public class FiveDice2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] playerDice = new int[5];
        int[] computerDice = new int[5];

        // Roll dice for player
        for (int i = 0; i < 5; i++) {
            playerDice[i] = 1 + random.nextInt(6);
        }

        // Roll dice for computer
        for (int i = 0; i < 5; i++) {
            computerDice[i] = 1 + random.nextInt(6);
        }

        // Display results
        System.out.print("Player's dice: ");
        displayDice(playerDice);
        System.out.print("Computer's dice: ");
        displayDice(computerDice);

        // Determine winner
        int playerRank = evaluateHand(playerDice);
        int computerRank = evaluateHand(computerDice);

        System.out.println("Player's hand rank: " + playerRank);
        System.out.println("Computer's hand rank: " + computerRank);

        if (playerRank > computerRank) {
            System.out.println("Player wins!");
        } else if (computerRank > playerRank) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static void displayDice(int[] dice) {
        for (int die : dice) {
            System.out.print(die + " ");
        }
        System.out.println();
    }

    private static int evaluateHand(int[] dice) {
        int[] counts = new int[7]; // Index 0 is unused, index 1-6 for die values

        for (int die : dice) {
            counts[die]++;
        }

        // Check for ranks
        for (int i = 5; i >= 2; i--) { // Check from Five of a kind to a pair
            if (counts[i] == 5) return 5; // Five of a kind
            if (counts[i] == 4) return 4; // Four of a kind
            if (counts[i] == 3) return 3; // Three of a kind
            if (counts[i] == 2) return 2; // A pair
        }

        return 1; // No pair
    }
}
