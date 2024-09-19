import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];

        // Accept nine integers
        System.out.println("Enter nine integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate mean
        double mean = Arrays.stream(numbers).average().orElse(0);

        // Calculate median
        Arrays.sort(numbers);
        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }

        // Display results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);

        scanner.close();
    }
}
