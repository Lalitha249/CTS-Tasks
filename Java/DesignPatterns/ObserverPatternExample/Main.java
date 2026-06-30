package ObserverPatternExample;

public class Main {
public static void main(String[] args) {
	StockMarket stockmarket = new StockMarket();
	MobileApp mobile = new MobileApp();
	WebApp web = new WebApp();
	stockmarket.register(mobile);
	stockmarket.register(web);
	stockmarket.setStockPrice(500);
}
}
