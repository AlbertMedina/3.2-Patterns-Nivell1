package level3;

public class Main {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        shoeStore.buyShoes(new CreditCardPayment());
        System.out.println("-------------------------------");
        shoeStore.buyShoes(new PaypalPayment());
        System.out.println("-------------------------------");
        shoeStore.buyShoes(new BankAccountPayment());
    }
}
