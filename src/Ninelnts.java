import java.util.Scanner;

public class Ninelnts {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 9 integers:");
        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers from first to last:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nNumbers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
