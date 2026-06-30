package ObserverPatternExample;
import java.util.ArrayList;
import  java.util.List;
public class StockMarket implements Stock {

	private List<Observer> s = new ArrayList<>();
	private double stockprice;
	@Override
	public void register(Observer observer) {
		
		s.add(observer);
	}

	@Override
	public void deregister(Observer observer) {
		
		s.remove(observer);
	}
	@Override
	public void notifyobservers() {
		
		for(Observer observer : s)
		{
			observer.update();
		}
	}
	public void setStockPrice(double StockPrice)
	{
		this.stockprice=StockPrice;
		notifyobservers();
	}

	

}
