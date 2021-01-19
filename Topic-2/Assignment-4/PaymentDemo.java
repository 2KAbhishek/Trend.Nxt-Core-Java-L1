public class PaymentDemo {

    public static void main(String[] args) {
        Payment pay1 = new Payment(56);
        pay1.paymentDetails();
        CashPayment pay2 = new CashPayment(140);
        pay2.paymentDetails();
        CashPayment pay3 = new CashPayment(550);
        pay3.paymentDetails();
        CreditCardPayment pay4 = new CreditCardPayment(1000, "Abhishek", "1234-5678-9123", "12/27");
        pay4.paymentDetails();
        CreditCardPayment pay5 = new CreditCardPayment(15000, "Abhishek", "4321-5678-9123", "10/23");
        pay5.paymentDetails();
    }
}
