package level3;

public class CreditCardPayment implements Callback {

    @Override
    public void call() {
        System.out.println("Paid with credit card");
    }
}
