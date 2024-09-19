import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double input;

        System.out.println("Enter up to 15 double values (99999 to quit):");
        while (numbers.size() < 15) {
            input = scanner.nextDouble();
            if (input == 99999) {
                break;
            }
            numbers.add(input);
        }

        if (numbers.isEmpty()) {
            System.out.println("Error: No numbers were entered.");
        } else {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();
            System.out.println("Count: " + numbers.size());
            System.out.println("Average: " + average);
            for (double number : numbers) {
                System.out.println("Value: " + number + ", Distance from average: " + Math.abs(number - average));
            }
        }

        scanner.close();
    }
}
