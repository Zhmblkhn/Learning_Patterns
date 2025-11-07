package AdapterPattern.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.pay(1500);
    }
}
