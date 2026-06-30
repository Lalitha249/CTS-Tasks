package FactoryPattern;

public class NotificationFactory {

	public Notification getNotification(String notify)
	{
		if(notify.equals("SMS"))
		{
			return new SMS_Notification();
		}
		else if(notify.equals("Email"))
		{
			return new EmailNotification();
		}
		else 
			return null;
	}
}
