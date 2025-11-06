//Практика: реализовать класс PaymentContext, выбирающий стратегию оплаты (Card, PayPal)


interface PaymentStrategy {
    void pay(int amount);
}

class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата картой: " + amount + " рублей.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата через PayPal: " + amount + " долларов.");
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main14 {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CardPayment());
        context.pay(1000); 

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(100); 
    }
}
