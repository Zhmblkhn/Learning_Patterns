package AdapterPattern.PaymentMethod;

public class PayPal {
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
