package Solid_Principles;

public class CardPayment implements payment {

	@Override
	public void pay() {
		System.out.println("payment via card");
		
	}
	public void bill()
	{
		System.out.println("Recieve bill");
	}
	

}
