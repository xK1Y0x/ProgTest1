import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        String[] names = new String[30];
        String[] phoneNumbers = new String[30];

        // Initialize the first 10 entries
        names[0] = "Alice";
        phoneNumbers[0] = "555-1234";
        names[1] = "Bob";
        phoneNumbers[1] = "555-5678";
        names[2] = "Charlie";
        phoneNumbers[2] = "555-8765";
        names[3] = "David";
        phoneNumbers[3] = "555-4321";
        names[4] = "Eva";
        phoneNumbers[4] = "555-1357";
        names[5] = "Frank";
        phoneNumbers[5] = "555-2468";
        names[6] = "Grace";
        phoneNumbers[6] = "555-3579";
        names[7] = "Hannah";
        phoneNumbers[7] = "555-8642";
        names[8] = "Ian";
        phoneNumbers[8] = "555-9512";
        names[9] = "Jane";
        phoneNumbers[9] = "555-7531";

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a name (or type 'quit' to exit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            // Search for the name in the directory
            int index = findNameIndex(names, input);
            if (index != -1) {
                System.out.println("Phone number for " + input + ": " + phoneNumbers[index]);
            } else {
                // Name not found, prompt for phone number
                if (isDirectoryFull(names)) {
                    System.out.println("Directory is full. Cannot add new entry.");
                } else {
                    System.out.print("Name not found. Enter phone number for " + input + ": ");
                    String phoneNumber = scanner.nextLine();
                    addEntry(names, phoneNumbers, input, phoneNumber);
                    System.out.println("Added " + input + " with phone number " + phoneNumber);
                }
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }

    private static int findNameIndex(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                return i;
            }
        }
        return -1; // Name not found
    }

    private static boolean isDirectoryFull(String[] names) {
        for (String name : names) {
            if (name == null) {
                return false; // There's space available
            }
        }
        return true; // No space available
    }

    private static void addEntry(String[] names, String[] phoneNumbers, String name, String phoneNumber) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) { // Find the first empty spot
                names[i] = name;
                phoneNumbers[i] = phoneNumber;
                return;
            }
        }
    }
}
