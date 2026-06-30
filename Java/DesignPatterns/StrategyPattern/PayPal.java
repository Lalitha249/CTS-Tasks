package StrategyPattern;

public class PayPal implements paymentStrategy{

	@Override
	public void pay() {
		System.out.println("Payement through paypal");
		
		
	}

}
