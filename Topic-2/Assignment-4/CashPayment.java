public class CashPayment extends Payment {
    String mode = "cash";

    public CashPayment(double amount) {
        super(amount);
    }

    void paymentDetails() {
        super.paymentDetails();
        System.out.println("Payment mode: " + this.mode);
    }

}
