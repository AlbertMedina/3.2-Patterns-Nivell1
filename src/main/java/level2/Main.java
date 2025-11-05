package level2;

public class Main {
    public static void main(String[] args) {

        Stockbroker stockbroker = new Stockbroker();

        BrokerageA alpha = new BrokerageA("Alpha");
        BrokerageB beta = new BrokerageB("Beta");
        BrokerageB gamma = new BrokerageB("Gamma");
        BrokerageA delta = new BrokerageA("Delta");

        stockbroker.addBrokerage(alpha);
        stockbroker.addBrokerage(beta);
        stockbroker.addBrokerage(gamma);

        stockbroker.updateStocksState("Stocks up");

        System.out.println("----------------------------------------------------------------");

        stockbroker.addBrokerage(delta);

        stockbroker.updateStocksState("Stocks down");

        System.out.println("----------------------------------------------------------------");

        stockbroker.removeBrokerage(beta);
        stockbroker.removeBrokerage(gamma);

        stockbroker.updateStocksState("Stocks up");
    }
}
