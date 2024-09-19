import java.util.Random;
import java.util.Scanner;

public class SecretPhrase2 {
    public static void main(String[] args) {
        String[] phrases = {
                "No man is an island",
                "To be or not to be",
                "A journey of a thousand miles",
                "The early bird catches the worm",
                "Actions speak louder than words",
                "A picture is worth a thousand words",
                "Better late than never",
                "When it rains it pours",
                "The grass is always greener",
                "Every cloud has a silver lining"
        };

        Random rand = new Random();
        String phrase = phrases[rand.nextInt(phrases.length)];
        String hiddenPhrase = phrase.replaceAll("[A-Za-z]", "*");

        Scanner scanner = new Scanner(System.in);
        StringBuilder revealed = new StringBuilder(hiddenPhrase);

        while (revealed.toString().contains("*")) {
            System.out.println("Current Phrase: " + revealed);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < phrase.length(); i++) {
                if (Character.toLowerCase(phrase.charAt(i)) == guess) {
                    revealed.setCharAt(i, phrase.charAt(i)); // Reveal letter
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                System.out.println("Incorrect guess.");
            }
        }

        System.out.println("Congratulations! You've guessed the phrase: " + phrase);
        scanner.close();
    }
}
