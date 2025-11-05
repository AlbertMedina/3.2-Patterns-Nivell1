package level3;

public class BankAccountPayment implements Callback {

    @Override
    public void call() {
        System.out.println("Paying with bank account");
    }
}
