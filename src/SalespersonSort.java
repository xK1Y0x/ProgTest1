import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args) {
        Salesperson[] salespeople = new Salesperson[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < salespeople.length; i++) {
            System.out.print("Enter ID for salesperson " + (i + 1) + ": ");
            int id = scanner.nextInt();
            System.out.print("Enter annual sales for salesperson " + (i + 1) + ": ");
            double sales = scanner.nextDouble();
            salespeople[i] = new Salesperson(id, sales);
        }

        System.out.print("Display by (1) ID or (2) Sales Value? ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            sortById(salespeople);
        } else {
            sortBySales(salespeople);
        }

        System.out.println("Sorted Salespeople:");
        for (Salesperson sp : salespeople) {
            System.out.println(sp);
        }

        scanner.close();
    }

    private static void sortById(Salesperson[] salespeople) {
        java.util.Arrays.sort(salespeople, (a, b) -> Integer.compare(a.getIdNumber(), b.getIdNumber()));
    }

    private static void sortBySales(Salesperson[] salespeople) {
        java.util.Arrays.sort(salespeople, (a, b) -> Double.compare(a.getAnnualSales(), b.getAnnualSales()));
    }
}
