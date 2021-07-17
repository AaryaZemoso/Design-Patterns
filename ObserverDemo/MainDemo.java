package ObserverDemo;

public class MainDemo
{
    public static void main(String args[])
    {
        StockBroker sb[] = new StockBroker[5];

        for(int i=0;i<sb.length;i++)
            sb[i] = new StockBroker();

        ITCStocks itcStocks = new ITCStocks();
        ZemosoStocks zemosoStocks = new ZemosoStocks();

        for(int i=0;i< sb.length;i++)
            zemosoStocks.addObserver(sb[i]);

        itcStocks.addObserver(sb[0]);
        itcStocks.addObserver(sb[2]);
        itcStocks.addObserver(sb[4]);

        itcStocks.stockUpdate(46);
        zemosoStocks.stockUpdate(90);
    }
}