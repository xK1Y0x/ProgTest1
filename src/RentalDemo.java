import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rental[] rentals = new Rental[8];

        // Get data for each Rental object
        for (int i = 0; i < rentals.length; i++) {
            System.out.println("Enter details for Rental " + (i + 1) + ":");
            System.out.print("Contract Number: ");
            int contractNumber = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Equipment Type (0: Personal Watercraft, 1: Pontoon Boat, 2: Rowboat, 3: Canoe, 4: Kayak, 5: Beach Chair, 6: Umbrella, 7: Other): ");
            int equipmentType = scanner.nextInt();

            Rental rental = new Rental(contractNumber, price);
            rental.setEquipmentType(equipmentType);
            rentals[i] = rental;
        }

        // Sorting options
        while (true) {
            System.out.println("Choose sorting option (1: Contract Number, 2: Price, 3: Equipment Type, 0: Exit): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Arrays.sort(rentals, Comparator.comparingInt(Rental::getContractNumber));
                    break;
                case 2:
                    Arrays.sort(rentals, Comparator.comparingDouble(Rental::getPrice));
                    break;
                case 3:
                    Arrays.sort(rentals, Comparator.comparingInt(Rental::getEquipmentType));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Display sorted rentals
            System.out.println("Sorted Rentals:");
            for (Rental rental : rentals) {
                System.out.printf("Contract Number: %d, Price: %.2f, Equipment Type: %d (%s)%n",
                        rental.getContractNumber(), rental.getPrice(), rental.getEquipmentType(), rental.getEquipmentTypeString());
            }
        }
        scanner.close();
    }
}
