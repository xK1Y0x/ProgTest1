public class DemoSalesperson2 {
    public static void main(String[] args) {
        Salesperson[] salespeople = new Salesperson[10];

        for (int i = 0; i < salespeople.length; i++) {
            int idNumber = 111 + i;
            double salesValue = 25000 + (5000 * i);
            salespeople[i] = new Salesperson(idNumber, salesValue);
        }

        System.out.println("Salespeople:");
        for (Salesperson sp : salespeople) {
            System.out.println(sp);
        }
    }
}
