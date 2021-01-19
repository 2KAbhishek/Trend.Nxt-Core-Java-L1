public class CreditCardPayment extends Payment {
    String name, number, expiry;

    public CreditCardPayment(double amount, String name, String number, String expiry) {
        super(amount);
        this.name = name;
        this.number = number;
        this.expiry = expiry;
    }

    void paymentDetails() {
        super.paymentDetails();
        System.out.println("Credit card details:\n Name: " + this.name + "\n Card Number: " + this.number
                + "\n Expiry Date: " + this.expiry);
    }
}
