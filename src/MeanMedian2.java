import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int count = 0;

        System.out.println("Enter up to 20 integers (type 'done' to finish):");

        while (count < numbers.length) {
            if (scanner.hasNextInt()) {
                numbers[count] = scanner.nextInt();
                count++;
            } else if (scanner.hasNext() && scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }

        // Calculate mean
        double mean = Arrays.stream(numbers, 0, count).average().orElse(0);

        // Calculate median
        int[] validNumbers = Arrays.copyOf(numbers, count);
        Arrays.sort(validNumbers);
        double median;
        if (validNumbers.length % 2 == 0) {
            median = (validNumbers[validNumbers.length / 2 - 1] + validNumbers[validNumbers.length / 2]) / 2.0;
        } else {
            median = validNumbers[validNumbers.length / 2];
        }

        // Display results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);

        scanner.close();
    }
}
