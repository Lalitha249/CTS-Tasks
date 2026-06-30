package ObserverPatternExample;

public class WebApp implements Observer{

	@Override
	public void update() {
		System.out.println("stok market is update msg recieved via webapp");
		
	}

}
