public class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    void paymentDetails() {
        System.out.println("\nAmount paid: " + this.amount);
    }
}
