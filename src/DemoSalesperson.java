public class DemoSalesperson {
    public static void main(String[] args) {
        Salesperson[] salespeople = new Salesperson[10];

        for (int i = 0; i < salespeople.length; i++) {
            salespeople[i] = new Salesperson(9009, 0);
        }

        System.out.println("Salespeople:");
        for (Salesperson sp : salespeople) {
            System.out.println(sp);
        }
    }
}
