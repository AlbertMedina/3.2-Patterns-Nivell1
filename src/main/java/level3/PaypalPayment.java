package level3;

public class PaypalPayment implements Callback {

    @Override
    public void call() {
        System.out.println("Paid with Paypal");
    }
}
