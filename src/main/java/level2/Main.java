package level2;

public class Main {
    public static void main(String[] args) {

        Stockbroker stockbroker = new Stockbroker();

        stockbroker.addBrokerage(new BrokerageA("Alpha"));
        stockbroker.addBrokerage(new BrokerageB("Beta"));
        stockbroker.addBrokerage(new BrokerageB("Gamma"));

        stockbroker.updateStocksState("Stocks up!");

        System.out.println("------------------------------------------------");

        stockbroker.addBrokerage(new BrokerageA("Delta"));

        stockbroker.updateStocksState("Stocks down!");
    }
}
