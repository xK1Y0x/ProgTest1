import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String[] responses = {
                "Yes, definitely.",
                "It is certain.",
                "Without a doubt.",
                "Yes, in due time.",
                "You may rely on it.",
                "As I see it, yes.",
                "Yes, you will.",
                "Most likely.",
                "Outlook good.",
                "Yes, but not now.",
                "Don't count on it.",
                "My sources say no.",
                "No, definitely not.",
                "Very doubtful.",
                "It's unclear, try again.",
                "Ask again later.",
                "Cannot predict now.",
                "Better not tell you now.",
                "Concentrate and ask again.",
                "I wouldn't count on it.",
                "Yes, but it's complicated."
        };

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String question;

        System.out.println("Welcome to the Magic 8 Ball! Type your question below.");

        while (true) {
            System.out.print("Enter your question (or type 'quit' to exit): ");
            question = scanner.nextLine();

            if (question.equalsIgnoreCase("quit")) {
                break;
            }

            int randomIndex = rand.nextInt(responses.length);
            System.out.println("Magic 8 Ball says: " + responses[randomIndex]);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}