package AdapterPattern.PaymentMethod;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal; // внутренний объект (Adaptee)

    // Конструктор
    public PayPalAdapter() {
        this.payPal = new PayPal(); // создаём переходник
    }

    // Реализация метода интерфейса PaymentProcessor
    @Override
    public void pay(double amount) {
        payPal.makePayment(amount); // перенаправляем вызов
    }
}
