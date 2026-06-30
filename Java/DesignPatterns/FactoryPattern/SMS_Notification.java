package FactoryPattern;

public class SMS_Notification implements Notification{

	@Override
	public void send() {
		System.out.println("Sms sent");
		
	}

}
