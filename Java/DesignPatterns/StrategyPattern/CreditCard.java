package StrategyPattern;

public class CreditCard implements paymentStrategy{

	@Override
	public void pay() {
		System.out.println("Payment through creditcard");
		
	}

}
