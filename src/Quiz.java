import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = {
                "What is the primary color of the sky?\nA) Blue\nB) Green\nC) Red",
                "What is the capital of France?\nA) Berlin\nB) Madrid\nC) Paris",
                "What is the largest mammal?\nA) Elephant\nB) Blue Whale\nC) Giraffe",
                "What is the boiling point of water?\nA) 100°C\nB) 90°C\nC) 80°C",
                "What is the primary ingredient in guacamole?\nA) Tomato\nB) Avocado\nC) Onion",
                "What is the tallest mountain in the world?\nA) K2\nB) Everest\nC) Kilimanjaro",
                "What is the main ingredient in sushi?\nA) Rice\nB) Pasta\nC) Bread",
                "What is the currency of Japan?\nA) Yen\nB) Won\nC) Dollar",
                "What is the fastest land animal?\nA) Cheetah\nB) Lion\nC) Horse",
                "What is the primary ingredient in beer?\nA) Water\nB) Hops\nC) Barley"
        };

        char[] answers = {'A', 'C', 'B', 'A', 'B', 'B', 'A', 'A', 'A', 'C'};
        int correctCount = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char userAnswer = ' ';
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Your answer (A, B, or C): ");
                userAnswer = scanner.next().toUpperCase().charAt(0);

                if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C') {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter A, B, or C.");
                }
            }

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("The correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nTotal Correct Answers: " + correctCount);
        System.out.println("Total Incorrect Answers: " + (questions.length - correctCount));

        scanner.close();
    }
}
