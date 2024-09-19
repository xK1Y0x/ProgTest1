import java.util.Scanner;

class AnimalNode {
    String questionOrAnimal;
    AnimalNode yesBranch;
    AnimalNode noBranch;

    public AnimalNode(String questionOrAnimal) {
        this.questionOrAnimal = questionOrAnimal;
        this.yesBranch = null;
        this.noBranch = null;
    }
}

public class DoesItHaveLegs {
    private AnimalNode root;
    private Scanner scanner;

    public DoesItHaveLegs() {
        // Initialize with a default animal tree
        root = new AnimalNode("Does it have legs?");
        root.yesBranch = new AnimalNode("Is it a Dog?");
        root.yesBranch.yesBranch = new AnimalNode("Dog");
        root.yesBranch.noBranch = new AnimalNode("Is it a Cat?");
        root.yesBranch.noBranch.yesBranch = new AnimalNode("Cat");
        root.yesBranch.noBranch.noBranch = new AnimalNode("Horse");

        root.noBranch = new AnimalNode("Is it a Fish?");
        root.noBranch.yesBranch = new AnimalNode("Fish");
        root.noBranch.noBranch = new AnimalNode("Is it a Snake?");
        root.noBranch.noBranch.yesBranch = new AnimalNode("Snake");
        root.noBranch.noBranch.noBranch = new AnimalNode("Bird");

        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Welcome to 'Does It Have Legs?'!");
        play(root);
    }

    private void play(AnimalNode node) {
        if (node.yesBranch == null && node.noBranch == null) {
            System.out.println("Is it a " + node.questionOrAnimal + "?");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                System.out.println("Yay! I win! Do you want to play again? (yes/no)");
                response = scanner.nextLine().toLowerCase();
                if (response.equals("yes")) {
                    play(root);
                } else {
                    System.out.println("Thanks for playing!");
                }
            } else {
                System.out.println("I give up. What was your animal?");
                String animal = scanner.nextLine();
                System.out.println("Type a question for which the answer is 'Yes' for " + animal + " but 'No' for " + node.questionOrAnimal + ".");
                String newQuestion = scanner.nextLine();
                System.out.println("What is the answer for " + animal + "? (yes/no)");
                String answer = scanner.nextLine().toLowerCase();

                AnimalNode newAnimalNode = new AnimalNode(animal);
                if (answer.equals("yes")) {
                    node.noBranch = new AnimalNode(newQuestion);
                    node.noBranch.yesBranch = newAnimalNode;
                    node.noBranch.noBranch = node;
                } else {
                    node.noBranch = new AnimalNode(newQuestion);
                    node.noBranch.yesBranch = node;
                    node.noBranch.noBranch = newAnimalNode;
                }

                System.out.println("Do you want to play again? (yes/no)");
                response = scanner.nextLine().toLowerCase();
                if (response.equals("yes")) {
                    play(root);
                } else {
                    System.out.println("Thanks for playing!");
                }
            }
        } else {
            System.out.println(node.questionOrAnimal);
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                play(node.yesBranch);
            } else {
                play(node.noBranch);
            }
        }
    }

    public static void main(String[] args) {
        DoesItHaveLegs game = new DoesItHaveLegs();
        game.startGame();
    }
}
