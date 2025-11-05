package level3;

public class ShoeStore {

    private final PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void buyShoes(Callback payment) {
        System.out.println("Buying shoes");
        paymentGateway.pay(payment);
        System.out.println("Purchase completed");
    }
}
