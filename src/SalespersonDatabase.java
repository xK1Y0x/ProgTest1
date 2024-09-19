import java.util.Scanner;

public class SalespersonDatabase {
    private static Salesperson[] database = new Salesperson[20];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option: 1. Add 2. Delete 3. Change 4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSalesperson(scanner);
                    break;
                case 2:
                    deleteSalesperson(scanner);
                    break;
                case 3:
                    changeSalesperson(scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addSalesperson(Scanner scanner) {
        if (count >= database.length) {
            System.out.println("Error: Database is full.");
            return;
        }

        System.out.print("Enter ID number: ");
        int id = scanner.nextInt();
        if (findSalespersonById(id) != -1) {
            System.out.println("Error: ID already exists.");
            return;
        }

        System.out.print("Enter sales value: ");
        double sales = scanner.nextDouble();
        database[count++] = new Salesperson(id, sales);
        displayDatabase();
    }

    private static void deleteSalesperson(Scanner scanner) {
        if (count == 0) {
            System.out.println("Error: Database is empty.");
            return;
        }

        System.out.print("Enter ID number to delete: ");
        int id = scanner.nextInt();
        int index = findSalespersonById(id);
        if (index == -1) {
            System.out.println("Error: ID not found.");
            return;
        }

        database[index] = database[--count]; // Remove the record
        database[count] = null; // Null out the last entry
        displayDatabase();
    }

    private static void changeSalesperson(Scanner scanner) {
        if (count == 0) {
            System.out.println("Error: Database is empty.");
            return;
        }

        System.out.print("Enter ID number to change: ");
        int id = scanner.nextInt();
        int index = findSalespersonById(id);
        if (index == -1) {
            System.out.println("Error: ID not found.");
            return;
        }

        System.out.print("Enter new sales value: ");
        double newSales = scanner.nextDouble();
        database[index].setAnnualSales(newSales);
        displayDatabase();
    }

    private static int findSalespersonById(int id) {
        for (int i = 0; i < count; i++) {
            if (database[i].getIdNumber() == id) {
                return i;
            }
        }
        return -1;
    }

    private static void displayDatabase() {
        System.out.println("Current Database:");
        for (int i = 0; i < count; i++) {
            System.out.println(database[i]);
        }
    }
}
