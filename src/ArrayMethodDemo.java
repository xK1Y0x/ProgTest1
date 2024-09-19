import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        displayNumbers(numbers);
        displayNumbersInReverse(numbers);
        displaySum(numbers);
        displayLessThanTwelve(numbers);
        displayAboveAverage(numbers);

        scanner.close();
    }

    // Method to display all integers
    public static void displayNumbers(int[] numbers) {
        System.out.println("All integers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line for better readability
    }

    // Method to display integers in reverse order
    public static void displayNumbersInReverse(int[] numbers) {
        System.out.println("Integers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // New line for better readability
    }

    // Method to display the sum of the integers
    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the integers: " + sum);
    }

    // Method to display values less than 12
    public static void displayLessThanTwelve(int[] numbers) {
        System.out.println("Values less than 12:");
        boolean found = false;
        for (int number : numbers) {
            if (number < 12) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values less than 12.");
        } else {
            System.out.println(); // New line for better readability
        }
    }

    // Method to display values above the average
    public static void displayAboveAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        System.out.println("Values above the average (" + average + "):");
        boolean found = false;
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values above the average.");
        } else {
            System.out.println(); // New line for better readability
        }
    }
}
