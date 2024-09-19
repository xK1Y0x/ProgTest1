import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        Map<String, String> birthdayMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        // Input loop for names and birthdates
        while (count < 10) {
            System.out.print("Enter name (or 'ZZZ' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("ZZZ")) {
                break;
            }

            System.out.print("Enter birthdate for " + name + ": ");
            String birthdate = scanner.nextLine();

            birthdayMap.put(name, birthdate);
            count++;
        }

        // Display the number of names entered and the names
        System.out.println("You entered " + birthdayMap.size() + " names.");
        System.out.println("Names entered:");
        for (String name : birthdayMap.keySet()) {
            System.out.println(name);
        }

        // Loop to query for birthdates
        String queryName;
        while (true) {
            System.out.print("Enter a name to get the birthdate (or 'ZZZ' to stop): ");
            queryName = scanner.nextLine();
            if (queryName.equalsIgnoreCase("ZZZ")) {
                break;
            }

            if (birthdayMap.containsKey(queryName)) {
                System.out.println("Birthdate of " + queryName + ": " + birthdayMap.get(queryName));
            } else {
                System.out.println("Error: No birthdate found for " + queryName + ".");
            }
        }

        scanner.close();
    }
}
