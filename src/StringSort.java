import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[15];
        int count = 0;

        // Accept user input for up to 15 strings
        while (count < 15) {
            System.out.print("Enter a string (or type 'done' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            strings[count] = input;
            count++;
        }

        // Sort and display the strings
        Arrays.sort(strings, 0, count);
        System.out.println("\nSorted Strings:");
        for (int i = 0; i < count; i++) {
            System.out.println(strings[i]);
        }

        scanner.close();
    }
}

