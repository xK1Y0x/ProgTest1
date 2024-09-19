import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5];

        for (int i = 0; i < purchases.length; i++) {
            purchases[i] = new Purchase();

            int invoiceNumber;
            double saleAmount;

            // Prompt for a valid invoice number
            while (true) {
                System.out.print("Enter invoice number (1000 - 8000): ");
                invoiceNumber = scanner.nextInt();
                if (invoiceNumber >= 1000 && invoiceNumber <= 8000) {
                    purchases[i].setInvoiceNumber(invoiceNumber);
                    break; // Valid invoice number
                } else {
                    System.out.println("Invalid invoice number. Please try again.");
                }
            }

            // Prompt for a valid sale amount
            while (true) {
                System.out.print("Enter sale amount (non-negative): ");
                saleAmount = scanner.nextDouble();
                if (saleAmount >= 0) {
                    purchases[i].setSaleAmount(saleAmount);
                    break; // Valid sale amount
                } else {
                    System.out.println("Invalid sale amount. Please enter a non-negative value.");
                }
            }
        }

        // Display all purchase details
        System.out.println("\nPurchase Details:");
        for (Purchase purchase : purchases) {
            purchase.display();
            System.out.println(); // Print an empty line for better readability
        }

        scanner.close();
    }
}
