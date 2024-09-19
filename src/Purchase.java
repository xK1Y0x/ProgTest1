public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    // Set the invoice number
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    // Set the sale amount and calculate sales tax
    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05; // Calculate 5% sales tax
    }

    // Display purchase details
    public void display() {
        System.out.printf("Invoice Number: %d%n", invoiceNumber);
        System.out.printf("Sale Amount: %.2f%n", saleAmount);
        System.out.printf("Sales Tax: %.2f%n", salesTax);
    }
}
