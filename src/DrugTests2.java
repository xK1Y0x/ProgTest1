import java.util.Arrays;

public class DrugTests2 {
    public static void main(String[] args) {
        int[] employeeCount = new int[30]; // Count of tests for each employee

        // Generate 52 random employee selections
        for (int week = 1; week <= 52; week++) {
            int testedEmployee = (int) (Math.random() * 30) + 1; // Random employee number between 1 and 30
            employeeCount[testedEmployee - 1]++; // Increment the selected employee's count

            // Display the employee number
            System.out.printf("Week %2d: Employee %d\n", week, testedEmployee);
        }

        // Display counts of each employee
        System.out.println("\nEmployee Test Counts:");
        for (int i = 0; i < employeeCount.length; i++) {
            System.out.printf("Employee %d: %d times\n", (i + 1), employeeCount[i]);
        }

        // Display employees that were never selected
        System.out.print("\nEmployees never selected: ");
        for (int i = 0; i < employeeCount.length; i++) {
            if (employeeCount[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
