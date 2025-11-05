package level3;

public class PaymentGateway {

    public void pay(Callback payment) {
        System.out.println("Processing payment...");
        payment.call();
        System.out.println("Payment completed");
    }
}
